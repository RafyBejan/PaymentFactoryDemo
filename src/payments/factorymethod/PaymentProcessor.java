package payments.factorymethod;


public abstract class PaymentProcessor {

   
    public void processPayment(double amount) {
        Payment payment = createPayment(); // FACTORY METHOD
        System.out.println("Processing payment of: " + amount);
        payment.pay(amount);
        System.out.println("Payment processed.\n");
    }

    protected abstract Payment createPayment();
}
