package StructuralDesignPatterns.flyweight.with;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CarFactory {
  private Map<String, Car> flyweights = new HashMap<>();// Usage example
  public class Main {
    public static void main(String[] args) {
      CarFactory factory = new CarFactory();

      List<Car> cars = new ArrayList<>();

      Car car1 = factory.getCar("Toyota", "Camry");
      car1.setColor("Blue");
      car1.setVIN("VIN123");
      cars.add(car1);

      Car car2 = factory.getCar("Honda", "Accord");
      car2.setColor("Red");
      car2.setVIN("VIN456");
      cars.add(car2);

      Car car3 = factory.getCar("Toyota", "Corolla");
      car3.setColor("Green");
      car3.setVIN("VIN789");
      cars.add(car3);

      for (Car car : cars) {
        System.out.println("Manufacturer: " + car.getManufacturer() + ", Model: " + car.getModel());
      }

      // Additional operations with cars...
    }
  }

  public Car getCar(String manufacturer, String model) {
    String key = manufacturer + "_" + model;
    Car car = flyweights.get(key);
    
    if (car == null) {
      car = new Car(manufacturer, model);
      flyweights.put(key, car);
    }
    
    return car;
  }
}
