package BehavioralDesignPatterns.ChainOfResponsibilityPattern;

public class Director implements PurchaseApprover {
    private PurchaseApprover nextApprover;

    @Override
    public void setNextApprover(PurchaseApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void approve(Purchase purchase) {
        if (purchase.getAmount() <= 5000) {
            System.out.println("Director approved purchase #" + purchase.getId());
        } else if (nextApprover != null) {
            nextApprover.approve(purchase);
        } else {
            System.out.println("Purchase #" + purchase.getId() + " requires approval from higher authority.");
        }
    }
}