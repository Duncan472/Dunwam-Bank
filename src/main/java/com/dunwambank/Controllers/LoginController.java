package com.dunwambank.Controllers;

import com.dunwambank.Models.Model;
import com.dunwambank.views.AccountType;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button loginButton;

    @FXML
    private Button cancelButton;

    @FXML
    private ChoiceBox<AccountType> choiceBoxAccount;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        choiceBoxAccount.setItems(
                FXCollections.observableArrayList(
                        AccountType.ADMIN,
                        AccountType.CLIENT
                )
        );

        choiceBoxAccount.setValue(AccountType.CLIENT);
    }

    @FXML
    private void loginOnAction() {

        AccountType selected = choiceBoxAccount.getValue();

        if (selected == null) {
            return;
        }

        Model.getInstance()
                .getViewFactory()
                .setLoginAccountType(selected);

        Stage stage = (Stage) loginButton.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);

        if (selected == AccountType.ADMIN) {
            Model.getInstance().getViewFactory().showAdminWindow();
        } else {
            Model.getInstance().getViewFactory().showClientWindow();
        }
    }

    @FXML
    private void cancelOnAction() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }
}
