// Purchase.java
package BehavioralDesignPatterns.ChainOfResponsibilityPattern;

public class Purchase {
    private int id;
    private double amount;

    public Purchase(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
}
