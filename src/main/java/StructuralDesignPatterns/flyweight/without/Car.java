package StructuralDesignPatterns.flyweight.without;

class Car {
  private String manufacturer;
  private String model;
  private String color;
  private String vin;

  public Car(String manufacturer, String model, String color, String vin) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.color = color;
    this.vin = vin;
  }

  // Other methods...
}
