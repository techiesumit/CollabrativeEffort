package com.sumit.designpatterns.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cvv;

    public CreditCard(String number, String date, String cvv) {
        this.number= number;
        this.date= date;
        this.cvv= cvv;
    }
}