package com.dunwambank.Controllers.Client;

import com.dunwambank.Models.Model;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientController implements Initializable {
    @FXML private Button account_btn;
    @FXML private Button dashboard_btn;
    @FXML private Button logout_btn;
    @FXML private Button profile_btn;
    @FXML private Button report_btn;
    @FXML private Button transaction_btn;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();

    }

    private void addListeners() {
        dashboard_btn.setOnAction(actionEvent -> onDashboard();)
        transaction_btn.setOnAction(actionEvent -> onTransactions());
}

    private void onTransactions() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Transactions");
    }

    private void onDashboard() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Dashboard");
    }
    private void onAccounts(){
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Accounts");
    }
}
