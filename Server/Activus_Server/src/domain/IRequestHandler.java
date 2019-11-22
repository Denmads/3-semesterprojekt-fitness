/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;


import models.Request;
import models.Response;
import layerInterfaces.IDatabaseFacade;
import persistence.DatabaseFacade;

/**
 * Handles a request and returns the corresponding response
 *
 * @author madsh
 */
public abstract class IRequestHandler {
    protected DatabaseFacade databaseFacade;
    
    public IRequestHandler (DatabaseFacade dbFacade) {
        databaseFacade = dbFacade;
    }
    
    public abstract Response handleRequest (Request request);
}
