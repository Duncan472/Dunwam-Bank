package com.dunwambank.Controllers.Client;

import com.dunwambank.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;


public class ClientMenuController  implements Initializable {

    public BoarderPane client_parent;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Models.getInstance.getViewFactory.getClientSelectedMenuItem().addListener((observableValue, oldVal, newVal));
            switch (newVal){
                case "Transactions"> client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionView());
            }
        });

    }
}
