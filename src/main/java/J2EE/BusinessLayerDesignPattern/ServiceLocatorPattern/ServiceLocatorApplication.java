package J2EE.BusinessLayerDesignPattern.ServiceLocatorPattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Map;

public class ServiceLocatorApplication {

    @Autowired
    private ServiceLocator serviceLocator;

    public static void main(String[] args) {
        SpringApplication.run(ServiceLocatorApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return new ApplicationRunner() {
            @Override
            public void run(ApplicationArguments args) throws Exception {
                Map<String, MyService> services = Map.of(
                        "serviceOne", new ServiceOne(),
                        "serviceTwo", new ServiceTwo()
                );

                serviceLocator.init(services);

                MyService serviceOne = serviceLocator.getService("serviceOne");
                serviceOne.execute();

                MyService serviceTwo = serviceLocator.getService("serviceTwo");
                serviceTwo.execute();
            }
        };
    }
}