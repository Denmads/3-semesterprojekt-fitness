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
    
    protected ICommunication communicationLayer;
    
    public IService (ICommunication communication) {
        communicationLayer = communication;
    }
}