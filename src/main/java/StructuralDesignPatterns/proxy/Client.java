package StructuralDesignPatterns.proxy;

public class Client {
    public static void main(String[] args) {
        Image image = new ImageProxy("image.jpg");

        // The real image is loaded only when needed (lazy initialization)
        image.display();

        // The real image is not loaded again, as it was already loaded
        image.display();
    }
}
