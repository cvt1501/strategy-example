package org.strategy.example.payment;

import java.util.Map;

public class PaymentService {

    private final Map<String, Payment> payments;

    public PaymentService(Map<String, Payment> payments) {
        this.payments = payments;
    }

    public void pay(String paymentType) {
        Payment payment = payments.get(paymentType);

        payment.pay();
    }

}
