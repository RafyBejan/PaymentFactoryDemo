package payments.factorymethod;

public class CreditCardProcessor extends PaymentProcessor {

    @Override
    protected Payment createPayment() {
        return new CreditCardPayment();
    }
}
