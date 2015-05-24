package com.patterns2.mediator;

/**
 * Абстрактный класс "Посредник"
 */
public abstract class Mediator {

    /**
     * Отправка сообщения {@code message} от указанного отправителя {@code colleague}
     * @param message отправляемое сообщение
     * @param colleague отправитель сообщения
     */
    public abstract void Send(String message, Colleague colleague);
}
