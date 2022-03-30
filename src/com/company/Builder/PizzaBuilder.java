package com.company.Builder;

public interface PizzaBuilder {

    public void buildSauce();

    public void buildSize();

    public void buildToppings();

    public Pizza getPizza();
}
