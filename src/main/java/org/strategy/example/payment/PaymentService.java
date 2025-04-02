package org.strategy.example.payment;

import org.strategy.example.payment.strategies.Payment;

import java.util.Map;

public class PaymentService {

    private final Map<String, Payment> payments;

    public PaymentService(final Map<String, Payment> payments) {
        this.payments = payments;
    }

    public void pay(final String paymentType) {
        var payment = payments.get(paymentType);

        payment.pay();
    }

}
