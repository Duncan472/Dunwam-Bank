package com.dunwambank.views;

import com.dunwambank.Controllers.Client.ClientController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane ;
import javafx.stage.Stage;

public class ViewFactory {
    //client View
    private AnchorPane dashboardView;

    public ViewFactory(){}

    public AnchorPane getDashboardView(){
        if(dashboardView == null ){
            try{
                dashboardView= new FXMLLoader((getClass().getResource("/Fxml/Client/Dashboard.fxml"))).load();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return dashboardView;
    }

    public void showLoginWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        Scene scene = null;
        try{
            scene= new Scene(loader.load());
        }catch (Exception e){
            e.printStackTrace();
        }
    Stage stage=new Stage();
        stage.setScene(scene);
        stage.setTitle("Dunwam Bank");
        stage.show();
    }
    public void showClientWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
    }

}
