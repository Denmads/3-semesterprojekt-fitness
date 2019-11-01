/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author perte
 */
public class ProfilePageController extends ContentPageController {

    @FXML
    private Circle circleProfilePic;
    @FXML
    private TextField fieldName;
    @FXML
    private TextField fieldCountry;
    @FXML
    private TextField fieldGender;
    @FXML
    private TextField fieldGym;
    @FXML
    private TextField fieldCity;
    @FXML
    private Button btnSaveProfile;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

      
    }

    
    @FXML
    private void btnSaveProfileHandler(ActionEvent event) {
        if(btnSaveProfile.getText().equals("Save profile info")){
            saveProfile();
        } else{
            modifyProfile();
        }
        
    }
    
    private void modifyProfile(){
        fieldCity.setEditable(true);
        fieldCountry.setEditable(true);
        fieldGender.setEditable(true);
        fieldGym.setEditable(true);
        fieldName.setEditable(true);
        btnSaveProfile.setText("Save profile info");
    }
    
    
    //should send data to server
    private void saveProfile(){
        fieldCity.setEditable(false);
        fieldCountry.setEditable(false);
        fieldGender.setEditable(false);
        fieldGym.setEditable(false);
        fieldName.setEditable(false);
        btnSaveProfile.setText("Modify profile info");
        //save data to server TODO
    }

   

  
}