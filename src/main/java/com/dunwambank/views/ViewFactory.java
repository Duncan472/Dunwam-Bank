package com.dunwambank.views;

import com.dunwambank.Controllers.Admin.AdminController;
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
    private final StringProperty clientSelectedMenuItem;
    private AnchorPane dashboardView;
    private AnchorPane transactionView;
    private AnchorPane accountsView;

    //Admin Views
    private final  StringProperty adminSelectedMenuItem;
    private AnchorPane createClientView;
//
//    public ViewFactory() {
//        this.adminSelectedMenuItem = new SimpleStringProperty("Dashboard");
//    }

//    Client View Sections

    public StringProperty getClientSelectedMenuItem() {

        return clientSelectedMenuItem;
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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Client.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public StringProperty getAdminSelectedMenuItem(){
        return adminSelectedMenuItem;
    }

    public AnchorPane getCreateClientView() {
        if (createClientView== null){
            try{
                createClientView = new FXMLLoader(getClass().getResource("/Fxml/Admin/CreateClient.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return createClientView;
    }

    public void showAdminWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Admin/Admin.fxml"));
        AdminController controller = new AdminController();
        loader.setController(controller);
        createStage(loader);

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
