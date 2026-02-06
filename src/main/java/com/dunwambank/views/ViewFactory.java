package com.dunwambank.views;

import com.dunwambank.Controllers.Admin.AdminController;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * Responsible for loading and managing application views.
 */
public class ViewFactory {

    // ---------------- STATE ----------------

    private AccountType loginAccountType = AccountType.CLIENT;

    // ---------------- CLIENT ----------------

    private final ObjectProperty<ClientMenuOptions> clientSelectedMenuItem =
            new SimpleObjectProperty<>();

    private AnchorPane dashboardView;
    private AnchorPane transactionView;
    private AnchorPane accountsView;

    // ---------------- ADMIN ----------------

    private final ObjectProperty<AdminMenuOptions> adminSelectedMenuItem =
            new SimpleObjectProperty<>(AdminMenuOptions.CLIENTS);

    private AnchorPane createClientView;
    private AnchorPane clientsView;

    // ---------------- GETTERS ----------------

    public AccountType getLoginAccountType() {
        return loginAccountType;
    }

    public void setLoginAccountType(AccountType loginAccountType) {
        this.loginAccountType = loginAccountType;
    }

    public ObjectProperty<ClientMenuOptions> getClientSelectedMenuItem() {
        return clientSelectedMenuItem;
    }

    public ObjectProperty<AdminMenuOptions> getAdminSelectedMenuItem() {
        return adminSelectedMenuItem;
    }

    // ---------------- CLIENT VIEWS ----------------

    public AnchorPane getDashboardView() {
        if (dashboardView == null) {
            dashboardView = loadAnchorPane("/Fxml/Client/Dashboard.fxml");
        }
        return dashboardView;
    }

    public AnchorPane getTransactionView() {
        if (transactionView == null) {
            transactionView = loadAnchorPane("/Fxml/Client/Transaction.fxml");
        }
        return transactionView;
    }

    public AnchorPane getAccountsView() {
        if (accountsView == null) {
            accountsView = loadAnchorPane("/Fxml/Client/Accounts.fxml");
        }
        return accountsView;
    }

    // ---------------- ADMIN VIEWS ----------------

    public AnchorPane getCreateClientView() {
        if (createClientView == null) {
            createClientView = loadAnchorPane("/Fxml/Admin/CreateClient.fxml");
        }
        return createClientView;
    }

    public AnchorPane getClientsView() {
        if (clientsView == null) {
            clientsView = loadAnchorPane("/Fxml/Admin/Clients.fxml");
        }
        return clientsView;
    }

    // ---------------- WINDOWS ----------------

    public void showLoginWindow() {
        createStage("/Fxml/Login.fxml", "Dunwam Bank - Login");
    }

    public void showAdminWindow() {
        createStage("/Fxml/Admin/Admin.fxml", "Dunwam Bank - Admin");
    }

    public void showClientWindow() {
        createStage("/Fxml/Client/ClientMenu.fxml", "Dunwam Bank - Client");
    }

    public void closeStage(Stage stage) {
        stage.close();
    }

    // ---------------- HELPERS ----------------

    private AnchorPane loadAnchorPane(String path) {
        try {
            return FXMLLoader.load(getClass().getResource(path));
        } catch (Exception e) {
            throw new RuntimeException("Failed to load FXML: " + path, e);
        }
    }

    private void createStage(String fxmlPath, String title) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle(title);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
