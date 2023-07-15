package StructuralDesignPatterns.flyweight.without;

import java.util.*;

// Usage example
public class Main {
  public static void main(String[] args) {
    List<Car> cars = new ArrayList<>();
    cars.add(new Car("Toyota", "Camry", "Blue", "VIN123"));
    cars.add(new Car("Honda", "Accord", "Red", "VIN456"));
    cars.add(new Car("Toyota", "Corolla", "Green", "VIN789"));
    
    // Additional operations with cars...
  }
}