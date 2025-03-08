package com.dunwambank.Controllers.Client;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

    public class DashboardController{

        @FXML
        private TextField amount_fld;

        @FXML
        private Label checking_acc_num;

        @FXML
        private Label checking_bal;

        @FXML
        private Label expense_labl;

        @FXML
        private Label income_lbl;

        @FXML
        private Label login_date;

        @FXML
        private TextArea message_fld;

        @FXML
        private TextField payee_fld;

        @FXML
        private Label savings_acc_num;

        @FXML
        private Label savings_bal;

        @FXML
        private Button send_money_btn;

        @FXML
        private ListView<?> transaction_listview;

        @FXML
        private Text user_name;

    

}
