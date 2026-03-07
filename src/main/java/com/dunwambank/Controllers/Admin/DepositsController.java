package com.dunwambank.Controllers.Admin;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
public class DepositsController implements Initializable {
    @FXML
    private TextField amount_field;
    @FXML
    private Button deposit_button;
    @FXML
    private TextField payeeAddress_field;
    @FXML
    private ListView<?> resultsListview;
    @FXML
    private Button search_button;
    @Override
    public void initialize(java.net.URL url, java.util.ResourceBundle resourceBundle) {


    }
}
