/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.serviceInterfaces;

import domain.chat.Message;
import Enums.ServiceType;
import layerInterfaces.ICommunicationFacade;
import layerInterfaces.IDomainFacade;
import layerInterfaces.IService;

/**
 * The service provinding methods related to chatting with buddies
 *
 * @author Patrick
 */
public abstract class IChatService extends IService {
    
    public IChatService(ICommunicationFacade communication, IDomainFacade domainFacade) {
        super(communication, domainFacade);
        type = ServiceType.CHAT;
    }
    
    public abstract void sendMessage(int buddyProfileId, Message message);
    
    public abstract Message[] getChatHistory(int buddyProfileId);
    
}