package com.dunwambank.Controllers.Admin;

import com.dunwambank.Models.Model;
import com.dunwambank.views.AdminMenuOptions;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminMenuController implements Initializable {

    @FXML
    private Button depositButton;

    @FXML
    private Button clientsButton;

    @FXML
    private Button createClientButton;

    @FXML
    private Button logoutButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        createClientButton.setOnAction(e -> onCreateClient());
        clientsButton.setOnAction(e -> onClients());
        // logoutButton.setOnAction(e -> onLogout()); // optional
    }

    private void onCreateClient() {
        Model.getInstance()
                .getViewFactory()
                .getAdminSelectedMenuItem()
                .set(AdminMenuOptions.CREATE_CLIENT);
    }

    private void onClients() {
        Model.getInstance()
                .getViewFactory()
                .getAdminSelectedMenuItem()
                .set(AdminMenuOptions.CLIENTS);
    }
}
