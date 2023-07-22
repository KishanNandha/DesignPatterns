package J2EE.BusinessLayerDesignPattern.BusinessDelegatePattern;

import org.springframework.stereotype.Service;

@Service("jmsService")
public class JmsService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}