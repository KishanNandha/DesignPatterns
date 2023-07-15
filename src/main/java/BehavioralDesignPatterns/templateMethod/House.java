package BehavioralDesignPatterns.templateMethod;

abstract class House {
    // Template method
    public final void buildHouse() {
        constructFoundation();
        constructWalls();
        constructRoof();
        if (hasGarden()) {
            createGarden();
        }
        decorateHouse();
    }

    // Abstract methods
    abstract void constructFoundation();

    abstract void constructWalls();

    abstract void constructRoof();

    abstract void decorateHouse();

    // Hook method
    boolean hasGarden() {
        return true;
    }

    // Hook method
    void createGarden() {
        System.out.println("Creating a beautiful garden.");
    }
}