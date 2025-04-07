package com.dunwambank;

import javafx.application.Application;
import javafx.stage.Stage;
import com.dunwambank.Models.Models;


public class App extends Application {
    @Override
    public void start(Stage stage) {
        Models.getInstance().getViewFactory().showLoginWindow();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
