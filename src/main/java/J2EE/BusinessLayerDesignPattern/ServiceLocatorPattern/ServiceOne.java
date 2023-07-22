package J2EE.BusinessLayerDesignPattern.ServiceLocatorPattern;
import org.springframework.stereotype.Service;
@Service("serviceOne")
public class ServiceOne implements MyService {
    @Override
    public void execute() {
        System.out.println("Executing Service One");
    }
}