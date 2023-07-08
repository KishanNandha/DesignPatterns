package CreationalDesignPatterns.factory;

public class CreditCardPayment implements  Payment{
    public void pay() {
        System.out.println("Paying via credit card");
    }
}
