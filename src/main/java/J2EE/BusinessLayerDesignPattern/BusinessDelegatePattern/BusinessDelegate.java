package J2EE.BusinessLayerDesignPattern.BusinessDelegatePattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessDelegate {
    private BusinessService businessService;

    @Autowired
    private BusinessService ejbService;

    @Autowired
    private BusinessService jmsService;

    public void setServiceType(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            businessService = ejbService;
        } else if (serviceType.equalsIgnoreCase("JMS")) {
            businessService = jmsService;
        } else {
            throw new IllegalArgumentException("Invalid service type: " + serviceType);
        }
    }

    public void doTask() {
        businessService.doProcessing();
    }
}