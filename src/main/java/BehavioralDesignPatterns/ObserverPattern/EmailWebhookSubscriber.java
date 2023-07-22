package BehavioralDesignPatterns.ObserverPattern;

public class EmailWebhookSubscriber implements WebhookSubscriber {
    private String email;

    public EmailWebhookSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void onEventReceived(String event) {
        System.out.println("Sending email to " + email + ": " + event);
    }
}