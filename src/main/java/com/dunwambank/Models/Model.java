package com.dunwambank.Models;

import com.dunwambank.views.AccountType;
import com.dunwambank.views.ViewFactory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Model {
    private static Model model;
    private ViewFactory viewFactory;
    private final DatabaseDriver databaseDriver;
    private AccountType loginAccountType = AccountType.CLIENT;

    //Client Data Section
    private final Client client;
    private boolean clientLoginSuccessFlag;
    //Admin Data section

    private Model() {
        this.viewFactory = new ViewFactory();
        this.databaseDriver = new DatabaseDriver();
   //Client Data Section
        this.clientLoginSuccessFlag = false;
        this.client = new Client("","","",null,null,null);
    }

    public synchronized static Model getInstance() {
        if (model == null) {
            model = new Model();

        }
        return model;
    }

    // Accessor for the shared ViewFactory instance
    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    public DatabaseDriver getDatabaseDriver() {
        return databaseDriver;
    }
    public AccountType getLoginAccountType() {
        return loginAccountType;
    }
    public void setLoginAccountType(AccountType loginAccountType) {
        this.loginAccountType = loginAccountType;
    }

    //Client Method section
    public boolean getClientLoginSuccessFlag() {return clientLoginSuccessFlag;
    }
    public void setClientLoginSuccessFlag(boolean flag) {
        this.clientLoginSuccessFlag = flag;
    }
    public Client getClient() {
        return client;
    }
    public void evaluateClientCredentials(String pAddress, String password) {
        ResultSet resultSet = databaseDriver.getClientData(pAddress, password);
        try {
               if (resultSet.isBeforeFirst());
                   while (resultSet.next())
                       this.client.firstNameProperty().set(resultSet.getString("firstName"));
                   this.client.lastNameProperty().set(resultSet.getString("lastName"));
                   this.client.payeeAddressProperty().set(resultSet.getString("payeeAddress"));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    }
