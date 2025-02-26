package com.dunwambank.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class LoginController  {


    @FXML
    private ImageView loginImage;

    public ChoiceBox acc_selector;
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
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/Images/Home.png")));
        loginImage.setImage(image);
    }

}
