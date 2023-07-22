package BehavioralDesignPatterns.decorator;

public class BasicPizza implements Pizza {
    public String getDescription() {
        return "Pizza";
    }

    public double getCost() {
        return 10.0;
    }
}