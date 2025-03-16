package Payments;

import PaymentMethod.PaymentMethod;

public class PayPalPayment implements PaymentMethod {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        return true;
    }
}