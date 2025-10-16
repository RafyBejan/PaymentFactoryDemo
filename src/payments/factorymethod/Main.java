package payments.factorymethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String type = null;
        if (args.length > 0) {
            type = args[0];
        } else {
            System.out.println("Choose payment type (credit, paypal, crypto): ");
            Scanner sc = new Scanner(System.in);
            type = sc.nextLine().trim().toLowerCase();
            sc.close();
        }

        PaymentProcessor processor;

        switch (type) {
            case "credit":
                processor = new CreditCardProcessor();
                break;
            case "crypto":
                processor = new CryptoProcessor();
                break;
            default:
                System.out.println("Unknown type '" + type + "'. Using credit card by default.");
                processor = new CreditCardProcessor();
                break;
        }

        processor.processPayment(250.00); 
    }
}
