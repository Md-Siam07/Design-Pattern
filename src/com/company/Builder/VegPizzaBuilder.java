package com.company.Builder;

public class VegPizzaBuilder implements PizzaBuilder{

    private Pizza pizza;
    private String sauce;
    private int size;

    public VegPizzaBuilder(String sauce, int size) {
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
        pizza.setToppings("veg toppings");
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
