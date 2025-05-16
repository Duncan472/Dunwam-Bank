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
                (observableValue, oldVal, newVal) -> {
                    switch (newVal) {
                        case "Transactions" -> client_parent.setCenter(
                                Model.getInstance().getViewFactory().getTransactionView()
                        );
                        // Add more cases here if needed
                    }
                }
        );

    }

}