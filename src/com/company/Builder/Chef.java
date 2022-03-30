package com.company.Builder;

public class Chef {
    private PizzaBuilder pizzaBuilder;

    public Chef(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza getPizza(){
        return this.pizzaBuilder.getPizza();
    }

    public void makePizza(){
        this.pizzaBuilder.buildSauce();
        this.pizzaBuilder.buildSize();
        this.pizzaBuilder.buildToppings();
    }
}
