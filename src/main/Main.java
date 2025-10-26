package main;

import context.PaymentContext;
import strategy.CreditCardPayment;
import strategy.PayPalPayment;

public class Main {
    public static void main(String[] args) {
        float firstAmount = 100f;
        float secondAmount = 150f;

        PaymentContext context = new PaymentContext();
        context.setStrategy(new CreditCardPayment());
        context.pay(firstAmount);

        context.setStrategy(new PayPalPayment());
        context.pay(secondAmount);
    }
}