package CreationalDesignPatterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
        // Create the concrete factory instance based on the desired product family
        GUIFactory factory = new WindowsFactory();
        
        // Create the application and configure it with the factory
        Application app = new Application(factory);

        // Create and render the UI
        app.createUI();
        app.renderUI();
    }
}