package com.patterns2.strategy;

/**
 ** {@link https://ru.wikipedia.org/wiki/%D0%A1%D1%82%D1%80%D0%B0%D1%82%D0%B5%D0%B3%D0%B8%D1%8F_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)}
 * {@link http://www.javenue.info/post/12}
 * {@link http://vk.com/topic-68704273_31855397}
 * ***********************************
 *Стратегия (шаблон проектирования)
 */

// Тестовое приложение
class StrategyExample {

    public static void main(String[] args) {

        Context context = new Context();

        context.setStrategy(new ConcreteStrategyAdd());
        int resultA = context.executeStrategy(3,4);

        context.setStrategy(new ConcreteStrategySubtract());
        int resultB = context.executeStrategy(3,4);

        context.setStrategy(new ConcreteStrategyMultiply());
        int resultC = context.executeStrategy(3,4);

        System.out.println("Result A : " + resultA );
        System.out.println("Result B : " + resultB );
        System.out.println("Result C : " + resultC );
    }
}
