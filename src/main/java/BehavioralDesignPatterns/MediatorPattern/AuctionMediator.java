package BehavioralDesignPatterns.MediatorPattern;

public interface AuctionMediator {
    void addBidder(Bidder bidder);
    void placeBid(Bidder bidder, int bidAmount);
    void announceWinner();
}