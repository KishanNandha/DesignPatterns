package J2EE.IntegrationLayerDesignPattern.WebServiceBrokerPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentServiceBroker {

    private static final String PAYMENT_SERVICE_URL = "https://payment-service-api.com/api/payments";

    private final RestTemplate restTemplate;

    @Autowired
    public PaymentServiceBroker(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Payment processPayment(Order order) {
        // Prepare the request entity with order data
        HttpHeaders headers = new HttpHeaders();
        // Set any necessary headers
        HttpEntity<Order> requestEntity = new HttpEntity<>(order, headers);

        // Make a RESTful POST request to the PaymentService to process the payment
        ResponseEntity<Payment> responseEntity = restTemplate.exchange(
                PAYMENT_SERVICE_URL,
                HttpMethod.POST,
                requestEntity,
                Payment.class
        );

        // Get the payment response from the PaymentService
        return responseEntity.getBody();
    }
}