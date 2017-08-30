package com.yitianyigexiangfa.airline.study.design.pattern.common.builder;

public class BuilderExample {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiian_pizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicy_pizzabuilder = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(hawaiian_pizzabuilder);
        waiter.constrcuPizza();

        Pizza pizza = waiter.getPizza();
    }
}
