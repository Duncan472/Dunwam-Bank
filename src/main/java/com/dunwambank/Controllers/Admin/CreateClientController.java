package com.dunwambank.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateClientController implements Initializable {
    public TextField firstName_field;

    public TextField lastName_filed;

    public TextField password_field;

    public CheckBox payeeAddress_box;

    public Label payeeAddress_label;

    public CheckBox checkingAccount_box;

    public TextField checkingAmount_field;

    public CheckBox savingsAccount_box;

    public TextField savingsAmount_field;

    public Button createClient_button;

    public Label error_label;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){}
}
