package BehavioralDesignPatterns.decorator;

public class PizzaOrder {
    public static void main(String[] args) {
        // Order a basic pizza
        Pizza pizza = new BasicPizza();
        System.out.println("Description: " + pizza.getDescription());
        System.out.println("Cost: $" + pizza.getCost());

        // Add cheese to the basic pizza
        CheeseDecorator pizza2 = new CheeseDecorator(pizza);
        System.out.println("Description: " + pizza2.getDescription());
        System.out.println("Cost: $" + pizza2.getCost());

        // Add tomato to the cheese pizza
        TomatoDecorator pizza3  = new TomatoDecorator(pizza);
        System.out.println("Description: " + pizza3.getDescription());
        System.out.println("Cost: $" + pizza3.getCost());
    }
}
