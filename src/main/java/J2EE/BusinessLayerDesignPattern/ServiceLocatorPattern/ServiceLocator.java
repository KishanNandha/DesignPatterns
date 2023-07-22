package J2EE.BusinessLayerDesignPattern.ServiceLocatorPattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ServiceLocator {
    private final Map<String, MyService> servicesCache = new HashMap<>();

    @Autowired
    public void init(Map<String, MyService> services) {
        for (Map.Entry<String, MyService> entry : services.entrySet()) {
            registerService(entry.getKey(), entry.getValue());
        }
    }

    public void registerService(String serviceName, MyService service) {
        servicesCache.put(serviceName, service);
    }

    public MyService getService(String serviceName) {
        return servicesCache.get(serviceName);
    }
}