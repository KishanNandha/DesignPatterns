package BehavioralDesignPatterns.ObserverPattern;

public class MainApp {
    public static void main(String[] args) {
        WebhookServiceImpl webhookPublisher = new WebhookServiceImpl();

        // Subscribe two observers (subscribers)
        webhookPublisher.subscribe(new EmailWebhookSubscriber("john@example.com"));
        webhookPublisher.subscribe(new LoggingWebhookSubscriber());

        // Trigger an event (e.g., new order placed)
        webhookPublisher.triggerEvent("New order placed: OrderID1234");
    }
}