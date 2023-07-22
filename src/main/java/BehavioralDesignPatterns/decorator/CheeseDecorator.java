package BehavioralDesignPatterns.decorator;

public class CheeseDecorator implements   PizzaDecorator {

    Pizza pizza;
    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}
