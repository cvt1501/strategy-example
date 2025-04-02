package org.strategy.example;

import org.strategy.example.payment.Payment;
import org.strategy.example.payment.PaymentService;
import org.strategy.example.payment.impl.CreditCardPayment;
import org.strategy.example.payment.impl.DebitCardPayment;
import org.strategy.example.payment.impl.TransferPayment;

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