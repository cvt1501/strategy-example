package org.strategy.example.payment.strategies;

public sealed interface Payment permits DebitCardPayment, CreditCardPayment, TransferPayment {

    void pay();

}
