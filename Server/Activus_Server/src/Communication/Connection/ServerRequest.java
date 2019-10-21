package Communication.Connection;

import Domain.RequestDelegater;
import Models.Request;

import java.io.*;
import java.net.Socket;

public class ServerRequest extends Thread {

    protected Socket socket;

    public ServerRequest(Socket clientSocket) {
        this.socket = clientSocket;
        System.out.println("Connected to "+this.socket.getInetAddress().toString());
    }

    public void run() {
        ObjectInput requestStream = null;
        ObjectOutputStream responseStream = null;
        try {
            requestStream = new ObjectInputStream(socket.getInputStream());
            responseStream = new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            return;
        }

        Request request = null;
       
            try {
                request = (Request)requestStream.readObject();
                
                //Handle Request and get respsone object
                RequestDelegater requestDelegater = new RequestDelegater();
                requestDelegater.delegate(request);
                //Send object back and close
                //resonseStream.WriteObject(response);
                
                socket.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                return;
            }
    }

}
