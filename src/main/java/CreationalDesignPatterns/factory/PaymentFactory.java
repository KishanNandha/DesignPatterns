package CreationalDesignPatterns.factory;

public class PaymentFactory {

    public Payment getPayment(String type) {
        Payment payment = null;
        if(type.equals("UPI")) {
            payment = new UPIPayment();
        }
        if(type.equals("CC")) {
            payment = new CreditCardPayment();
        }
        return payment;

    }
}
