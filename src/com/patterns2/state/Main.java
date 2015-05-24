package com.patterns2.state;

/**
 ** {@link http://uk.wikipedia.org/wiki/%D0%A1%D1%82%D0%B0%D0%BD_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D1%83%D0%B2%D0%B0%D0%BD%D0%BD%D1%8F)}
 * {@link http://cpp-reference.ru/patterns/behavioral-patterns/state/}
 * {@link http://info.javarush.ru/translation/2014/10/06/%D0%A0%D0%B0%D0%B7%D0%BD%D0%B8%D1%86%D0%B0-%D0%BC%D0%B5%D0%B6%D0%B4%D1%83-%D0%BF%D0%B0%D1%82%D1%82%D0%B5%D1%80%D0%BD%D0%B0%D0%BC%D0%B8-%D0%A1%D0%BE%D1%81%D1%82%D0%BE%D1%8F%D0%BD%D0%B8%D0%B5-%D0%B8-%D0%A1%D1%82%D1%80%D0%B0%D1%82%D0%B5%D0%B3%D0%B8%D1%8F-%D0%B2-Java.html}
 * ***********************************************
 * Стан (шаблон проектування)
 */
class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.openWindow();
        car.openDoor();
        car.on();
        car.openWindow();
        car.openDoor();
        car.start();
        car.openWindow();
        car.openDoor();
    }
}

