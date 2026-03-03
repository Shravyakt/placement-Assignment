/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancedjavaconcepts;

    // Interface
interface Payment {
    void pay(double amount);
}

// CreditCardPayment class implementing Payment
class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs. " + amount + " made using Credit Card.");
    }
}

// UPIPayment class implementing Payment
class UPIPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of Rs. " + amount + " made using UPI.");
    }
}

public class PaymentDemo {

// Main class based on topic
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();

        p1.pay(5000);
        p2.pay(1500);
    }
}
    
 