package CreationalDesignPatterns.factory;

public class Client {
    public static void main(String[] args) {
        PaymentFactory factory = new PaymentFactory();
        Payment payment = factory.getPayment("UPI");
        payment.pay();
    }
}
