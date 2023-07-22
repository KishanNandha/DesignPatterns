package J2EE.BusinessLayerDesignPattern.SessionFacadePattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderSessionFacade {
    private final OrderService orderService;

    @Autowired
    public OrderSessionFacade(OrderService orderService) {
        this.orderService = orderService;
    }

    public void processOrder(String customerName, String product, int quantity) {
        // Additional processing logic or validation can be added here before calling the OrderService
        orderService.createOrder(customerName, product, quantity);
        // Additional processing logic after calling the OrderService can also be added here
    }
}