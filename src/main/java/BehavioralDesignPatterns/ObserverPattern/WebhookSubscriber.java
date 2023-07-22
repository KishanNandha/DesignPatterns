package BehavioralDesignPatterns.ObserverPattern;

public interface WebhookSubscriber {
    void onEventReceived(String event);
}