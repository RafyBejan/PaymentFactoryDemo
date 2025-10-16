package payments.factorymethod;

public class CryptoPayment implements Payment {
    private String walletAddress;
    public CryptoPayment() {
        this.walletAddress = "0xABCDEF0123456789";
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cryptocurrency to wallet: " + walletAddress);
   
    }
}
