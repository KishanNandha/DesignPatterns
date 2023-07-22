package J2EE.BusinessLayerDesignPattern.BusinessDelegatePattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {
    private final BusinessDelegate businessDelegate;

    @Autowired
    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doTask() {
        businessDelegate.setServiceType("EJB");
        businessDelegate.doTask();

        businessDelegate.setServiceType("JMS");
        businessDelegate.doTask();
    }
}