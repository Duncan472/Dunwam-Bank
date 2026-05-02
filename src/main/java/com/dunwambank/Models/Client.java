package com.dunwambank.Models;

import com.dunwambank.views.AccountType;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;


public class Client {
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty payeeAddress;
    private final ObjectProperty <AccountType> checkingAccount;
    private final ObjectProperty<AccountType> savingsAccount;
    private final ObjectProperty<LocalDate> dateCreated;

    public Client(String fName, String lName, String pAddress, LocalDate date,AccountType cAccount, AccountType sAccount ) {
        this.firstName = new SimpleStringProperty(this "firstName", "fName");
        this.lastName = new SimpleStringProperty(this, "lastName", lName);
        this.payeeAddress = new SimpleStringProperty(this, "payeeAddress", pAddress);
        this.checkingAccount = new SimpleObjectProperty<>(this, "checkingAccount", cAccount);
        this.savingsAccount = new SimpleObjectProperty<>(this, "savingsAccount", sAccount);
        this.dateCreated = new SimpleObjectProperty<>(this, "dateCreated", date);
    }

}