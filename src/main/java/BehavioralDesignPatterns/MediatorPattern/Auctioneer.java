package BehavioralDesignPatterns.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Auctioneer implements AuctionMediator {
    private List<Bidder> bidders = new ArrayList<>();
    private Bidder highestBidder;
    private int highestBid = 0;

    @Override
    public void addBidder(Bidder bidder) {
        bidders.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int bidAmount) {
        if (bidAmount > highestBid) {
            highestBid = bidAmount;
            highestBidder = bidder;
        } else {
            System.out.println("Bid amount is too low.");
        }
    }

    @Override
    public void announceWinner() {
        if (highestBidder != null) {
            System.out.println("Auction Winner: " + highestBidder.getName() + " with a bid of " + highestBid);
        } else {
            System.out.println("No winner. Auction ended without bids.");
        }
    }
}