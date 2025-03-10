package com.dunwambank.Controllers.Client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML private TextField amount_fld;
    @FXML private Label checking_acc_num;
    @FXML private Label checking_bal;
    @FXML private Label expense_labl;
    @FXML private Label income_lbl;
    @FXML private Label login_date;
    @FXML private TextArea message_fld;
    @FXML private TextField payee_fld;
    @FXML private Label savings_acc_num;
    @FXML private Label savings_bal;
    @FXML private Button send_money_btn;
    @FXML private ListView<?> transaction_listview;
    @FXML private Text user_name;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialize Dashboard Logic Here
    }
}
