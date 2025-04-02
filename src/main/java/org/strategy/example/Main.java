package org.strategy.example;

import org.strategy.example.payment.strategies.Payment;
import org.strategy.example.payment.PaymentService;
import org.strategy.example.payment.strategies.CreditCardPayment;
import org.strategy.example.payment.strategies.DebitCardPayment;
import org.strategy.example.payment.strategies.TransferPayment;

import java.util.Map;

public class Main {
    private static final Map<String, Payment> payments = Map.of(
            "CREDIT", new CreditCardPayment(),
            "DEBIT", new DebitCardPayment(),
            "TRANSFER", new TransferPayment()
    );

    public static void main(String[] args) {
        var paymentService = new PaymentService(payments);

        paymentService.pay(args[0]);
    }
}