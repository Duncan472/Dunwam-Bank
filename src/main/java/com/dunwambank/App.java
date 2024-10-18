package com.dunwambank;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader= new FXMLLoader(getClass().getResource( name; "/Fxml/Login.fxml"))
        Scene scene = new Scene(FXMLLoader.load())
        stage.setScene(scene);
        stage.show();

    }
}
