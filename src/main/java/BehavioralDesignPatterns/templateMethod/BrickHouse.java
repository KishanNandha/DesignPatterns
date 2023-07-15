package BehavioralDesignPatterns.templateMethod;

class BrickHouse extends House {
    @Override
    void constructFoundation() {
        System.out.println("Constructing brick foundation.");
    }

    @Override
    void constructWalls() {
        System.out.println("Constructing brick walls.");
    }

    @Override
    void constructRoof() {
        System.out.println("Constructing brick roof.");
    }

    @Override
    void decorateHouse() {
        System.out.println("Decorating brick house.");
    }
}
