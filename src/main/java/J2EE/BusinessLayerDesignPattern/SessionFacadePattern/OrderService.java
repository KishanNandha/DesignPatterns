package J2EE.BusinessLayerDesignPattern.SessionFacadePattern;

public interface OrderService {
    void createOrder(String customerName, String product, int quantity);
    // Other order-related methods
}