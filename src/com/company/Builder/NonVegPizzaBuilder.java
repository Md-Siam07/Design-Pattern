package com.company.Builder;

public class NonVegPizzaBuilder implements PizzaBuilder{

    private Pizza pizza;
    private String sauce;
    private int size;

    public NonVegPizzaBuilder(String sauce, int size) {
        this.pizza = new Pizza();
        this.sauce = sauce;
        this.size = size;
    }

    @Override
    public void buildSauce() {
        pizza.setSauce(sauce);
    }

    @Override
    public void buildSize() {
        pizza.setSize(size);
    }

    @Override
    public void buildToppings() {
        pizza.setToppings("non-veg toppings");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
