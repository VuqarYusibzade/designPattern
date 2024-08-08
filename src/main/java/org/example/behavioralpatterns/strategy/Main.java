package org.example.behavioralpatterns.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment("1234 5678 9012 3456", "12/25", "123"));
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalPayment("email@email.com", "password"));
        cart.checkout(200);
    }
}
