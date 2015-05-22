package com.patterns2.decorator;

/**
 * Created by alexandr on 22.05.15.
 */
class DecoratorSpace extends Decorator{

    public DecoratorSpace(InterfaceComponent c) {
        super(c);
    }

    @Override
    public void doOperation() {
        System.out.print(" ");
        super.doOperation();
    }

    @Override
    public void newOperation() {
        System.out.println("New space operation");
    }
}
