package J2EE.BusinessLayerDesignPattern.ServiceLocatorPattern;

import org.springframework.stereotype.Service;

@Service("serviceTwo")
public class ServiceTwo implements MyService {
    @Override
    public void execute() {
        System.out.println("Executing Service Two");
    }
}