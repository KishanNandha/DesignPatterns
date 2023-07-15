package StructuralDesignPatterns.flyweight.with;

class Car {
  private String manufacturer;
  private String model;

  private String vin;

  private String color;

  public Car(String manufacturer, String model) {
    this.manufacturer = manufacturer;
    this.model = model;
  }

  public String getManufacturer() {
    return manufacturer;
  }
  
  public String getModel() {
    return model;
  }
  
  public void setColor(String color) {
    System.out.println("Setting color: " + color);
    // Set the color of the car
  }
  
  public void setVIN(String vin) {
    System.out.println("Setting VIN: " + vin);
    // Set the VIN of the car
  }
  
  // Other methods...
}