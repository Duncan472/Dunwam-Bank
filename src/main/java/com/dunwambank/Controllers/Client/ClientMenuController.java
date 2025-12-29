package com.dunwambank.Controllers.Client;

import javafx.fxml.Initializable;
import com.dunwambank.Models.Model;
import javafx.scene.layout.BorderPane;
import java.net.URL;
import java.util.ResourceBundle;

import static com.dunwambank.views.ClientMenuOptions.ACCOUNTS;
import static com.dunwambank.views.ClientMenuOptions.TRANSACTIONS;


public class ClientMenuController  implements Initializable {

    public BorderPane client_parent;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener(
                observable -> {
                   Model.getInstance().getViewFactory().getClientSelectedMenuItem().addListener((observable1, oldVal, newVal) -> {
                    switch (newVal) {
                        case TRANSACTIONS ->
                                client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionView());
                        case ACCOUNTS ->
                                client_parent.setCenter(Model.getInstance().getViewFactory().getAccountsView());
                        default ->
                                client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
                    }
                }
        );


                }
        );
    }
    }