package CreationalDesignPatterns.prototype;

class Square implements Cloneable {
    private int sideLength;
    private String color;

    public Square(int sideLength, String color) {
        this.sideLength = sideLength;
        this.color = color;
    }

    // Copy Constructor (Deep Copy)
    public Square(Square other) {
        this.sideLength = other.sideLength;
        this.color = other.color;
    }

    @Override
    public Square clone() {
        return new Square(this);
    }

    // Shallow Copy
    public Square shallowCopy() {
        return this;
    }

    public void draw() {
        System.out.println("Drawing Square with side length: " + sideLength + " and color: " + color);
    }

    // Other methods, getters, and setters
}