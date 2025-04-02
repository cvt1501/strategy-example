package org.strategy.example.payment.strategies;

public final class TransferPayment implements Payment {

    private static final int tax = 0;

    public TransferPayment() {}

    @Override
    public void pay() {
        System.out.print("Payed with transfer. Tax applied: " + tax + "%");
    }

}
