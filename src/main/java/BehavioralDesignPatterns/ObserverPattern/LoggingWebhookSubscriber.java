package BehavioralDesignPatterns.ObserverPattern;

public class LoggingWebhookSubscriber implements WebhookSubscriber {
    @Override
    public void onEventReceived(String event) {
        System.out.println("Logging event: " + event);
    }
}