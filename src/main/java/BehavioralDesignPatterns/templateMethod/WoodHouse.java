package BehavioralDesignPatterns.templateMethod;

class WoodHouse extends House {
    @Override
    void constructFoundation() {
        System.out.println("Constructing wooden foundation.");
    }

    @Override
    void constructWalls() {
        System.out.println("Constructing wooden walls.");
    }

    @Override
    void constructRoof() {
        System.out.println("Constructing wooden roof.");
    }

    @Override
    void decorateHouse() {
        System.out.println("Decorating wooden house.");
    }

    @Override
    boolean hasGarden() {
        return false;
    }
}

