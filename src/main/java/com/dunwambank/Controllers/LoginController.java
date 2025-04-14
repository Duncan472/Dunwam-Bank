package com.dunwambank.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;
import com.dunwambank.Models.Models;
import javafx.stage.Stage;

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
        loginButton.setOnAction(actionEvent -> onLogin());
    }
    private void onLogin(){
        Stage stage = (Stage)error_label.getScene().getWindow();
        Models.getInstance().getViewFactory().showClientWindow();
        Models.getInstance().getViewFactory().closeStage(stage);
    }


}
    @FXML
    private void cancelOnAction() {
        System.out.println("Cancel button clicked");
    }


}
