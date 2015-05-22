package com.patterns2.decorator;

/**
 * Created by alexandr on 22.05.15.
 */
class DecoratorHello extends Decorator {

    public DecoratorHello(InterfaceComponent c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print("Hello");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New hello operation");
    }
}
