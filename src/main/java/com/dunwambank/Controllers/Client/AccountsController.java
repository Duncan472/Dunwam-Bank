
package com.dunwambank.Controllers.Client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class AccountsController {

    @FXML
    public Label checkingTransactionLimit_lbl;

    @FXML
    public TextField amountToCheckingTextField;
    @FXML
    private TextField amountToCheckigTextField;

    @FXML
    private TextField amountToSavingsTextField;

    @FXML
    private Label checkingAccountBalance_lbl;

    @FXML
    private Label checkingAccountNumber_lbl;

    @FXML
    private Label checkingDateCreated_lbl;

    @FXML
    private Label dateCreated_label;

    @FXML
    private Label savingsAccountNumber_lbl;

    @FXML
    private Label savingsBalance_lbl;

    @FXML
    private Button transferToChecking_btn;

    @FXML
    private Button transferToSavings_btn;

    @FXML
    private Label withdrawalLimit_lbl;

}

