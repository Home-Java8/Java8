package com.patterns.behavioral.observer;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 10/07/2014
 ******************************************************
 * Применяется чтобы ослабить связь между зависимыми элементами-классами (при этом можно легко-находу отключать изменять параметры для
 * связаного элемента).
 */
public class Start {

    public static void main(String[] args) {
        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();

        Publisher publisher = new Publisher();

        publisher.addListener(subscriber1);
        publisher.addListener(subscriber2);

        publisher.createNewMessage("Message!");
    }
}
