package StructuralDesignPatterns.facade;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacadeImpl();
        facade.watchMovie("Avatar");
        // ... other operations
        facade.stopMovie();
    }
}