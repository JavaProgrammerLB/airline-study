package com.yitianyigexiangfa.airline.study.design.pattern.common.builder;

public class Waiter {

    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb){
        pizzaBuilder = pb;
    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }

    public void constrcuPizza(){
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
