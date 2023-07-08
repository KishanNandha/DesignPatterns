package CreationalDesignPatterns.factory;

public class UPIPayment implements  Payment{
    public void pay() {
        System.out.println("Paying via UPI");
    }
}
