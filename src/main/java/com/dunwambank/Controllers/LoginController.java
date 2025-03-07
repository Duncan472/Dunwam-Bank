package com.dunwambank.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


import java.util.Objects;

public class LoginController  {

    @FXML
    public Hyperlink ForgotPasswordHyperlink;
    @FXML
    public Button loginButton;
    @FXML
    private Button cancelButton;
    @FXML
    public Hyperlink forgotPasswordHyperlink;
    @FXML
    public Hyperlink helpHyperlink;
    @FXML
    public TextField payeeAddressTextField;
    @FXML
    public PasswordField passwordField;
    @FXML
    public ChoiceBox choiceBoxAccount;
    @FXML
    private ImageView loginImage;

//    public ChoiceBox acc_selector;
    public Label payee_address_lbl;
    public TextField payee_address_fld;
    public TextField password_fld;
    public Button login_btn;
    public Label error_lbl;

    @FXML
    public void initialize() {
        initializeUiElements();
    }

    private void initializeUiElements() {
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/icons8-bank-100.png")));
        loginImage.setImage(image);
    }

    public void cancelOnAction() {
        Stage window = (Stage) cancelButton.getScene().getWindow();
        window.close();
    }
    public void loginOnAction(){
        System.out.println("login click")
            }
}
