/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Enums.RequestArgumentName;
import Enums.RequestType;
import Exceptions.ArgumentNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.UUID;

/**
 *
 * @author madsh
 */
public class Request implements Serializable{

    private RequestType type;
    private UUID authToken;
    private int profileId;
    private HashMap<RequestArgumentName, Object> arguements;

    public Request(RequestType type, UUID authToken, int profileId) {
        this.type = type;
        this.authToken = authToken;
        this.profileId = profileId;
        arguements = new HashMap<>();
    }

    public RequestType getRequestType() {
        return type;
    }

    public UUID getAuthenticationToken() {
        return authToken;
    }

    public int getProfileId() {
        return profileId;
    }
    
    
    
    public void AddArgument (RequestArgumentName argName, Object value) {
        arguements.put(argName, value);
    }
    
    public <T> T GetArguement (RequestArgumentName argName) throws ArgumentNotFoundException, ClassCastException{
        if (!arguements.containsKey(argName)) {
            throw new ArgumentNotFoundException();
        }
        
        return (T)arguements.get(argName);
    }
}
