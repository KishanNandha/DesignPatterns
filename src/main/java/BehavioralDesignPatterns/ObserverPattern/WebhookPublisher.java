package BehavioralDesignPatterns.ObserverPattern;

public interface WebhookPublisher {
    void subscribe(WebhookSubscriber subscriber);
    void unsubscribe(WebhookSubscriber subscriber);
    void notifySubscribers(String event);
}