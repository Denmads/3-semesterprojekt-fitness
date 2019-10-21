package LayerInterfaces;

import Domain.serviceInterfaces.IAuthenticationService;
import Enums.RequestType;
import Exceptions.ServiceNotFoundException;
import Enums.ServiceType;
import Models.Request;

/**
 *
 * @author madsh
 */
public abstract class IService {

    protected ICommunicationFacade communicationLayer;
    protected IDomainFacade domainFacade;
    
    protected ServiceType type;

    public IService(ICommunicationFacade communication, IDomainFacade domainFacade) {
        communicationLayer = communication;
        this.domainFacade = domainFacade;
    }
    
    protected Request createRequest (RequestType type) throws ServiceNotFoundException {
        IAuthenticationService authenticationService = domainFacade.<IAuthenticationService>getService(ServiceType.AUTHENTICATION);
        return authenticationService.createServerRequest(this.type, type);
    }
}