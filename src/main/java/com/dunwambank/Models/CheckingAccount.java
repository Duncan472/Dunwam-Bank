package com.dunwambank.Models;

import javafx.beans.property.*;

public class CheckingAccount extends Account {
    //number of transactions a client is allowed to make per day
    private final IntegerProperty transactionLimit;


    public CheckingAccount(String owner,String accountNumber, double balance, int limit) {
        super(owner,accountNumber,balance);
        this.transactionLimit = new SimpleIntegerProperty(this, "Transaction Limit", limit);

    }
    public IntegerProperty transactionLimitProp() {return transactionLimit;}

}
