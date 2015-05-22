package com.patterns2.decorator;

/**
 * Created by alexandr on 22.05.15.
 */
public class Main {
    public static void main (String... s) {
//        Decorator c = new DecoratorHello(new DecoratorComma(new DecoratorSpace(new MainComponent()))); // Hello, World!New hello operation
//        Decorator c = new DecoratorHello(new DecoratorComma(new MainComponent()));                     // Hello,World!New hello operation
        Decorator c = new DecoratorHello(new MainComponent());                                         // HelloWorld!New hello operation
        c.doOperation(); // Результат выполнения программы "Hello, World!"
        c.newOperation(); // New hello operation
    }
}
