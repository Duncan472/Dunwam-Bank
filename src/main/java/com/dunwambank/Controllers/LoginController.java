package com.dunwambank.Controllers;

import com.dunwambank.views.AccountType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;
import com.dunwambank.Models.Model;
import javafx.stage.Stage;
import javafx.collections.FXCollections;

public class LoginController implements Initializable {

    @FXML
    public Hyperlink forgotPasswordHyperlink;
    @FXML
    public Hyperlink helpHyperlink;
    @FXML
    public Button loginButton; // Fixed Button reference
    @FXML
    private Button cancelButton;
    @FXML
    public TextField payeeAddressTextField;
    @FXML
    public PasswordField passwordField;
    @FXML
    public ChoiceBox<AccountType> choiceBoxAccount;
    @FXML
    public ImageView loginImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBoxAccount.setItems(
                FXCollections.observableArrayList(
                        AccountType.ADMIN,
                        AccountType.CLIENT
                )
        );

        loginButton.setOnAction(e -> loginOnAction());
    }

    @FXML
    private void cancelOnAction() {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void loginOnAction() {
        Stage stage = (Stage) loginButton.getScene().getWindow();
        Model.getInstance().getViewFactory().closeStage(stage);

        if (Model.getInstance().getViewFactory().getLoginAccountType() == AccountType.CLIENT) {
            Model.getInstance().getViewFactory().showClientWindow();
        } else {
            Model.getInstance().getViewFactory().showAdminWindow();
        }
    }

}