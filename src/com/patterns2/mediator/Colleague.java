package com.patterns2.mediator;

/**
 * Абстрактный класс объектов, взаимодействующих посредством паттерна «Посредник»
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * Отправка сообщения посредством посредника
     * @param message сообщение
     */
    public void send(String message) {
        mediator.Send(message, this);
    }

    /**
     * Обработка полученного сообщения реализуется каждым конкретным
     * наследником
     * @param message получаемое сообщение
     */
    public abstract void notify(String message);
}

