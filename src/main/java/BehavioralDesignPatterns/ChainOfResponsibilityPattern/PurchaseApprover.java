package BehavioralDesignPatterns.ChainOfResponsibilityPattern;

public interface PurchaseApprover {
    void setNextApprover(PurchaseApprover nextApprover);
    void approve(Purchase purchase);
}