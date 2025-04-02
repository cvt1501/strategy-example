package org.strategy.example.payment.impl;

import org.strategy.example.payment.Payment;

public class DebitCardPayment implements Payment {

    private static final int tax = 0;

    public DebitCardPayment() {}

    @Override
    public void pay() {
        System.out.print("Payed with debit card. Tax applied: " + tax + "%");
    }

}
