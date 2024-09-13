package third_lesson.src;

public interface PaymentSystem {
    void pay(double amount);
    void refund(double amount);
}

class CreditCard implements PaymentSystem {
    private double balance;

    public CreditCard(double balance) {
        this.balance = balance;
    }

    @Override
    public void pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Paid " + amount + " with CreditCard.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void refund(double amount) {
        balance += amount;
        System.out.println("Refunded " + amount + " to CreditCard.");
    }
}

class PayPal implements PaymentSystem {
    private double balance;

    public PayPal(double balance) {
        this.balance = balance;
    }

    @Override
    public void pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Paid " + amount + " with PayPal.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void refund(double amount) {
        balance += amount;
        System.out.println("Refunded " + amount + " to PayPal.");
    }
}
