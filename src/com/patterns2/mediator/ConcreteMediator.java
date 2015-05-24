package com.patterns2.mediator;

/**
 * Посредник, реализующий конкретный алгоритм отправки сообщений между двумя
 * типами получателей {@code ConcreteColleague1} и {@code ConcreteColleague2}
 */
public class ConcreteMediator extends Mediator {

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague) {
        this.colleague1 = colleague;
    }

    public void setColleague2(ConcreteColleague2 colleague) {
        this.colleague2 = colleague;
    }

    @Override
    public void Send(String message, Colleague colleague) {
        if (colleague.equals(colleague2)) {
            colleague1.notify(message);
        } else {
            colleague2.notify(message);
        }
    }
}

