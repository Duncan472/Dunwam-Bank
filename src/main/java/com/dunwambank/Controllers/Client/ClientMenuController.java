package com.dunwambank.Controllers.Client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import com.dunwambank.Models.Model;
import com.dunwambank.views.ClientMenuOptions;
import javafx.scene.layout.BorderPane;
import java.net.URL;
import java.util.ResourceBundle;


public class ClientMenuController implements Initializable {

    @FXML
    public BorderPane client_parent;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Set default view
        client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());

        // Add listener for menu item changes
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observable, oldVal, newVal) -> {
            switch (newVal) {
                case TRANSACTIONS ->
                        client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionView());
                case ACCOUNTS ->
                        client_parent.setCenter(Model.getInstance().getViewFactory().getAccountsView());
                case DASHBOARD ->
                        client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
            }
        });
    }
}
