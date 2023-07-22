package BehavioralDesignPatterns.MediatorPattern;

public class Bidder {
    private final String name;
    private final AuctionMediator mediator;

    public Bidder(String name, AuctionMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void placeBid(int bidAmount) {
        mediator.placeBid(this, bidAmount);
    }

    public String getName() {
        return name;
    }
}