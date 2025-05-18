package com.dunwambank.Controllers.Client;

import javafx.fxml.Initializable;
import com.dunwambank.Models.Model;
import javafx.scene.layout.BorderPane;
import java.net.URL;
import java.util.ResourceBundle;


public class ClientMenuController  implements Initializable {

    public BorderPane client_parent;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener(
                observable -> {
                    String newVal = Model.getInstance().getViewFactory().getClientSelectedMenuItem().get();
                    switch (newVal) {
                        case "Transactions" ->
                                client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionView());
                        case "Accounts" ->
                                client_parent.setCenter(Model.getInstance().getViewFactory().getAccountsView());
                        default ->
                                client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
                    }
                }
        );


    }

}