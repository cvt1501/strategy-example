package org.strategy.example.payment.impl;

import org.strategy.example.payment.Payment;

public class TransferPayment implements Payment {

    private static final int tax = 0;

    public TransferPayment() {}

    @Override
    public void pay() {
        System.out.print("Payed with transfer. Tax applied: " + tax + "%");
    }

}
