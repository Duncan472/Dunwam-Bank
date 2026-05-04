package com.dunwambank.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.StringProperty;

public class Account {
    private final StringProperty owner;
    private final StringProperty accountNumber;
    private final DoubleProperty balance;


    public Account(String owner, String accountNumber, double balance) {
        this.owner = new javafx.beans.property.SimpleStringProperty(this, "Owner", owner);
        this.accountNumber = new javafx.beans.property.SimpleStringProperty(this, "Account Number", accountNumber);
        this.balance = new javafx.beans.property.SimpleDoubleProperty(this, "Balance", balance);
    }

    public StringProperty ownerProperty() {
        return owner;
    }
    public StringProperty accountNumberProperty() {return accountNumber;}
    public DoubleProperty balanceProperty() {return balance;}

}