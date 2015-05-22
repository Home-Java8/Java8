package com.patterns2.decorator;

/**
 * Created by alexandr on 22.05.15.
 */
class DecoratorComma extends Decorator {

    public DecoratorComma(InterfaceComponent c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print(",");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New comma operation");
    }
}
