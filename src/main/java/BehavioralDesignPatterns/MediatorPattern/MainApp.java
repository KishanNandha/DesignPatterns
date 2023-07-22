package BehavioralDesignPatterns.MediatorPattern;

public class MainApp {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new Auctioneer();

        Bidder bidder1 = new Bidder("John", auctionMediator);
        Bidder bidder2 = new Bidder("Alice", auctionMediator);

        auctionMediator.addBidder(bidder1);
        auctionMediator.addBidder(bidder2);

        bidder1.placeBid(100);
        bidder2.placeBid(150);
        bidder1.placeBid(200);

        auctionMediator.announceWinner(); // Output: Auction Winner: John with a bid of 200
    }
}