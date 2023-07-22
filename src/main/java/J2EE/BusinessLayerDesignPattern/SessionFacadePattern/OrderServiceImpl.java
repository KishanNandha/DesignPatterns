package J2EE.BusinessLayerDesignPattern.SessionFacadePattern;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public void createOrder(String customerName, String product, int quantity) {
        // Implementation to create an order
        System.out.println("Creating order for " + customerName + " with " + quantity + " " + product);
    }

    // Other order-related methods implementation
}