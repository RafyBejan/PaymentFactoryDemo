package payments.factorymethod;

public class CreditCardPayment implements Payment {
    private String cardNumber;
    public CreditCardPayment() {
        this.cardNumber = "XXXX-XXXX-XXXX-1234";
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
      
    }
}
