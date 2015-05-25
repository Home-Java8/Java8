package com.patterns2.facade;

/**
 ** {@link https://ru.wikipedia.org/wiki/Фасад_(шаблон_проектирования)}
 * *********************************************
 * Фасад_(шаблон_проектирования)
 */

/* Client */

class Application {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}