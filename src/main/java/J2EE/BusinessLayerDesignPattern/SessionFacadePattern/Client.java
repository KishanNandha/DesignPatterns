package J2EE.BusinessLayerDesignPattern.SessionFacadePattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {
    private final OrderSessionFacade orderSessionFacade;

    @Autowired
    public Client(OrderSessionFacade orderSessionFacade) {
        this.orderSessionFacade = orderSessionFacade;
    }

    public void processOrder() {
        // Presentation layer interacts with the Session Facade
        orderSessionFacade.processOrder("John Doe", "Product A", 5);
    }
}