/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LayerInterfaces;

/**
 *
 * @author madsh
 */
public abstract class IService {
    
    protected ICommunicationFacade communicationLayer;
    
    public IService (ICommunicationFacade communication) {
        communicationLayer = communication;
    }
}
