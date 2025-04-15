package com.dunwambank.views;

import com.dunwambank.Controllers.Client.ClientController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
//package com.dunwambank;
//
import javafx.stage.Stage;


public class ViewFactory {
    //Client Views
    private AnchorPane dashboardView;
    private AnchorPane transactionView;




    public ViewFactory() {}

    public AnchorPane getDashboardView() {
        if (dashboardView == null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Dashboard.fxml"));
                dashboardView = loader.load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dashboardView;
    }

    public AnchorPane getTransactionView() {
        if (transactionView==null){
            try {
                transactionView=new FXMLLoader(getClass().getResource("/Fxml/Client/transaction.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return transactionView;
    }

    public void showLoginWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Dunwam Bank - Login");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void showClientWindow(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Login.fxml")).load();

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return showClientWindow();
    }

    private void createStage(FXMLLoader loader) {
        try {
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("Dunwam Bank - Client");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void closeStage(Stage stage){
        stage.close();
    }


}
