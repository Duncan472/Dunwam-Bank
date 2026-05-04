package com.dunwambank.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class Account {
    private final StringProperty owner;
    private final StringProperty accountNumber;
    private final DoubleProperty balance;


    public Account(String owner, String accountNumber, double balance) {
        this.owner = new javafx.beans.property.SimpleStringProperty(this, "Owner", owner);
        this.accountNumber = new javafx.beans.property.SimpleStringProperty(this, "Account Number", accountNumber);
        this.balance = new javafx.beans.property.SimpleDoubleProperty(this, "Balance", balance);
    }

    public String ownerProperty() {
        return owner;
    }
    public String accountNumberProperty() {return accountNumber;}
    public double balanceProperty() {return balance.get();}

}