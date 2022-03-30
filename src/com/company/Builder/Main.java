package com.company.Builder;

public class Main {

    public static void main(String[] args) {
        PizzaBuilder vegPizzaBuilder = new VegPizzaBuilder("tomato", 6);
        Chef siam = new Chef(vegPizzaBuilder);
        siam.makePizza();

        Pizza vegPizza = siam.getPizza();
        System.out.println(vegPizza.getPizzaInfo());

        siam.setPizzaBuilder(new VegPizzaBuilder("not tomato", 9));
        siam.makePizza();

        Pizza nonVegPizza = siam.getPizza();
        System.out.println(nonVegPizza.getPizzaInfo());
    }
}
