package LayerInterfaces;

import Models.Request;
import Models.Response;

/**
 * Can send request to the server and get a response back
 * Opens connection, sends request, receive response, close connection
 * 
 * @author madsh
 */
public interface ICommunicationFacade {

    public Response sendRequest(Request request);
}