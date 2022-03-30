package com.company.Builder;

public class Pizza{

    private String sauce, toppings;
    private int size;

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setToppings(String toppings) {
        this.toppings =  toppings;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getPizzaInfo(){
        return "sauce: " + sauce + " toppings: " + toppings + " size: " + size;
    }


}
