package com.dunwambank.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;
import com.dunwambank.Models.Models;

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
    public ChoiceBox<String> choiceBoxAccount;
    @FXML
    private ImageView loginImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loginButton.setOnAction(actionEvent -> Models.getInstance().getViewFactory().showClientWindow());
    }
    @FXML
    private void cancelOnAction() {
        System.out.println("Cancel button clicked");
    }

}
