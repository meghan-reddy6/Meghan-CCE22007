interface Payment {
    void pay(int amount); // abstract method
}

class CreditCardPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UpiPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

public class AbstractionExample2 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UpiPayment();
        
        p1.pay(1000);
        p2.pay(500);
    }
}
