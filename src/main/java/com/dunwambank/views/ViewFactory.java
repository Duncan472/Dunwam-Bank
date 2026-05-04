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

    public AnchorPane getAdminView(AdminMenuOptions option) {
        switch (option) {
            case CREATE_CLIENT:
                return getCreateClientView();
            case CLIENTS:
                return getClientsView();
            case DEPOSITS:
                return getDepositsView();
            default:
                return getClientsView();
        }
    }


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
    private AnchorPane depositsView;

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
          try{  dashboardView = new FXMLLoader(getClass().getResource("/Fxml/Client/Dashboard.fxml")).load();
          }catch (Exception e){
              e.printStackTrace();          }
        }
        return dashboardView;
    }

    public AnchorPane getTransactionView() {
        if (transactionView == null) {
       try{         transactionView = new FXMLLoader(getClass().getResource("/Fxml/Client/transactions.fxml")).load();
       }catch (Exception e){
           e.printStackTrace();       }
        }
        return transactionView;
    }

    public AnchorPane getAccountsView() {
        if (accountsView == null) {
            try {
                accountsView = new FXMLLoader(getClass().getResource("/Fxml/Client/Accounts.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
           return accountsView;
    }

    // ---------------- ADMIN VIEWS ----------------

    public AnchorPane getCreateClientView() {
        if (createClientView == null) {
            try {
                createClientView = new FXMLLoader(getClass().getResource("/Fxml/Admin/CreateClient.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return createClientView;
    }

    public AnchorPane getClientsView() {
        if (clientsView == null) {
            try {
                clientsView = new FXMLLoader(getClass().getResource("/Fxml/Admin/Clients.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return clientsView;
    }
    public AnchorPane getDepositsView() {
        if (depositsView == null) {
            try {
                depositsView = new FXMLLoader(getClass().getResource("/Fxml/Admin/Deposits.fxml")).load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return depositsView;
    }

    // ---------------- WINDOWS ----------------

    private Stage primaryStage;

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void showLoginWindow() {
        if (primaryStage != null) {
            createStageWithPrimary("/Fxml/Login.fxml", "Dunwam Bank - Login", primaryStage);
        } else {
            createStage("/Fxml/Login.fxml", "Dunwam Bank - Login");
        }
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

    private void createStageWithPrimary(String fxmlPath, String title, Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            stage.setScene(new Scene(root));
            stage.setTitle(title);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error loading FXML: " + fxmlPath);
            e.printStackTrace();
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
            System.err.println("Error loading FXML: " + fxmlPath);
            e.printStackTrace();
        }
    }
}
