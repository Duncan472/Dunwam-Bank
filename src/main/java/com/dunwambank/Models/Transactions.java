package com.dunwambank.Models;

import javafx.beans.property.*;

import java.time.LocalDate;

public class Transactions {
    private final StringProperty Sender;
    private final StringProperty Receiver;
    private final DoubleProperty Amount;
    private final ObjectProperty<LocalDate> Date;
    private final StringProperty Message;

    public Transactions(String sender, String receiver, double amount, LocalDate date, String message) {
        this.Sender = new SimpleStringProperty("this", "sender", sender);
        this.Receiver = new SimpleStringProperty("this", "receiver", sender);
        this.Amount = new SimpleDoubleProperty("this", "Amount", amount);
        this.Date = new SimpleObjectProperty<>("this", "Date", date);
        this.Message = new SimpleStringProperty("this", "message", message);
    }
    public StringProperty senderProperty() {return this.Sender;}
    public StringProperty receiverProperty() {return Receiver;}
    public DoubleProperty amountProperty() {return Amount;}
    public ObjectProperty<LocalDate> dateProperty() {return Date;}
    public StringProperty messageProperty() {return Message;}

}
