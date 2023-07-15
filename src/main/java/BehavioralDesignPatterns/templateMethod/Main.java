package BehavioralDesignPatterns.templateMethod;

public class Main {
    public static void main(String[] args) {
        House brickHouse = new BrickHouse();
        brickHouse.buildHouse();

        System.out.println();

        House woodHouse = new WoodHouse();
        woodHouse.buildHouse();
    }
}
