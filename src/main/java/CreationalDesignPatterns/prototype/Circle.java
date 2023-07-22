package CreationalDesignPatterns.prototype;

class Circle implements Cloneable {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Copy Constructor (Deep Copy)
    public Circle(Circle other) {
        this.radius = other.radius;
        this.color = other.color;
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    // Shallow Copy
    public Circle shallowCopy() {
        return this;
    }

    public void draw() {
        System.out.println("Drawing Circle with radius: " + radius + " and color: " + color);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}