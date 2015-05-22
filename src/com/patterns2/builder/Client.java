package com.patterns2.builder;

/** A customer ordering a pizza. */
class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        waiter.setPizzaBuilder(new SpicyPizzaBuilder()); //waiter.setPizzaBuilder(new HawaiianPizzaBuilder()); // (PizzaBuilder)
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza(); // (Pizza)

        System.out.println( pizza.toString() );
    }
}