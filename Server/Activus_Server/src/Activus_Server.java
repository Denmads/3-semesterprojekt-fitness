

import communication.TcpServer;

/**
 * Start th server
 *
 * @author steff
 */
public class Activus_Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TcpServer a = new TcpServer();
        a.start();
    }

}