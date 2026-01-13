package com.dunwambank.Controllers.Admin;

import com.dunwambank.Models.Model;
import com.dunwambank.views.AdminMenuOptions;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static com.dunwambank.views.AdminMenuOptions.*;

public class AdminMenuController implements Initializable {

    @FXML
    private Button DepositButton;

    @FXML
    private Button clientsButton;

    @FXML
    private Button createClientButton;

    @FXML
    private Button logoutButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        addListeners();
    }

    private void addListeners(){

    }
    private void  onCreateClient(){
        Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(String.valueOf(AdminMenuOptions.CREATE_CLIENT));
    }

}