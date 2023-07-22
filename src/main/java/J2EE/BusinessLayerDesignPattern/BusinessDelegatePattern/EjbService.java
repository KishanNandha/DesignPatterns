package J2EE.BusinessLayerDesignPattern.BusinessDelegatePattern;

import org.springframework.stereotype.Service;

@Service("ejbService")
public class EjbService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
