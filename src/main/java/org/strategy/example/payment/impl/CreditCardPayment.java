package org.strategy.example.payment.impl;

import org.strategy.example.payment.Payment;

public class CreditCardPayment implements Payment {

    private static final int tax = 5;

    public CreditCardPayment() {};

    @Override
    public void pay() {
        System.out.print("Payed with credit card. Tax applied: " + tax + "%");
    }


}
