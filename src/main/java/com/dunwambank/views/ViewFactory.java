package com.dunwambank.views;

import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {
    //Client Views
    private final StringProperty clientSelecteMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane transactionView;
    private AnchorPane accountsView;


    public ViewFactory() {
        this.clientSelecteMenuItem = new SimpleStringProperty(" ");
    }

//    Client View Sections
    private StringProperty clientSelectedMenuItem = new SimpleStringProperty("Dashboard");
    public StringProperty getClientSelectedMenuItem() {

        return clientSelecteMenuItem;
    }

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
    public AnchorPane getAccountsView(){
        if (accountsView==null){
            try{
                accountsView  = new FXMLLoader(getClass().getResource("/Fxml/Client/Accounts.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return accountsView;
    }

//    Admin Section
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

    public void showClientWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Login.fxml"));
            Parent root = loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
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


    public void setClientSelectedMenuItem(String clientSelectedMenuItem) {
        this.clientSelectedMenuItem.set(clientSelectedMenuItem);
    }
}
