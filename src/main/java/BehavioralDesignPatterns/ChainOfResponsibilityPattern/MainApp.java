package BehavioralDesignPatterns.ChainOfResponsibilityPattern;

public class MainApp {
    public static void main(String[] args) {
        Purchase purchase1 = new Purchase(1, 800);
        Purchase purchase2 = new Purchase(2, 2000);
        Purchase purchase3 = new Purchase(3, 6000);

        PurchaseApprover manager = new Manager();
        PurchaseApprover director = new Director();

        manager.setNextApprover(director);

        manager.approve(purchase1);
        manager.approve(purchase2);
        manager.approve(purchase3);
    }
}