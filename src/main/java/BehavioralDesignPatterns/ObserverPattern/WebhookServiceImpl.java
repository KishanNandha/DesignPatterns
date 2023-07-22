package BehavioralDesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WebhookServiceImpl implements WebhookPublisher {
    private final List<WebhookSubscriber> subscribers = new ArrayList<>();

    @Override
    public void subscribe(WebhookSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(WebhookSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String event) {
        for (WebhookSubscriber subscriber : subscribers) {
            subscriber.onEventReceived(event);
        }
    }

    // Simulate an event trigger, e.g., when a new order is placed
    public void triggerEvent(String eventData) {
        System.out.println("Event triggered: " + eventData);
        notifySubscribers(eventData);
    }
}