package com.sumit.designpatterns.sample;

public interface PayStrategy {
    public boolean pay(int amountToPay);
    public void collectPaymentDetails();
}