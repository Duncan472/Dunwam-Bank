package com.dunwambank.Controllers.Admin;

import com.dunwambank.Models.Model;
import com.dunwambank.views.AdminMenuOptions;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {

    @FXML
    private BorderPane admin_parent;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Model.getInstance()
                .getViewFactory()
                .getAdminSelectedMenuItem()
                .addListener((observable, oldValue, newValue) -> {

                    if (newValue == null) return;

                    switch (newValue) {
                        case CREATE_CLIENT ->
                                admin_parent.setCenter(
                                        Model.getInstance().getViewFactory().getCreateClientView()
                                );

                        case CLIENTS ->
                                admin_parent.setCenter(
                                        Model.getInstance().getViewFactory().getClientsView()
                                );
                    }
                });
    }
}
