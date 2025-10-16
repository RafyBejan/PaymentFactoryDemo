package payments.factorymethod;

public class CryptoProcessor extends PaymentProcessor {

    @Override
    protected Payment createPayment() {
        return new CryptoPayment();
    }
}

