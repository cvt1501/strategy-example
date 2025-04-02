package org.strategy.example.payment.strategies;

public final class CreditCardPayment implements Payment {

    private static final int tax = 5;

    public CreditCardPayment() {};

    @Override
    public void pay() {
        System.out.print("Payed with credit card. Tax applied: " + tax + "%");
    }


}
