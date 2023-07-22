package J2EE.IntegrationLayerDesignPattern.WebServiceBrokerPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final PaymentServiceBroker paymentServiceBroker;

    @Autowired
    public OrderController(PaymentServiceBroker paymentServiceBroker) {
        this.paymentServiceBroker = paymentServiceBroker;
    }

    @PostMapping("/placeOrder")
    public Payment placeOrder(@RequestBody Order order) {
        // Process the order and make a RESTful call to PaymentService to process payment
        return paymentServiceBroker.processPayment(order);
    }
}