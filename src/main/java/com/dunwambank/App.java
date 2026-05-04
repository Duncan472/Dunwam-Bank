package com.dunwambank;

import javafx.application.Application;
import javafx.stage.Stage;
import com.dunwambank.Models.Model;


public class App extends Application {
    @Override
    public void start(Stage stage) {
        try {
            // Pass the primary stage to ViewFactory
            Model.getInstance().getViewFactory().setPrimaryStage(stage);
            stage.setOnCloseRequest(e -> System.exit(0));
            Model.getInstance().getViewFactory().showLoginWindow();
        } catch (Exception e) {
            System.err.println("Error starting application:");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
