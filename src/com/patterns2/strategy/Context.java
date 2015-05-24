package com.patterns2.strategy;

// Класс контекста использующий интерфейс стратегии
class Context {

    private Strategy strategy;

    // Constructor
    public Context() {
    }

    // Set new strategy
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
