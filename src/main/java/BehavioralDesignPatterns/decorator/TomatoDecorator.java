package BehavioralDesignPatterns.decorator;

public class TomatoDecorator implements PizzaDecorator {
    
Pizza pizza;
    public TomatoDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
    public String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    public double getCost() {
        return pizza.getCost() + 1.5;
    }
}