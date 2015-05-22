package com.patterns2.decorator;

/**
 * Created by alexandr on 22.05.15.
 */
class MainComponent implements InterfaceComponent {

    @Override
    public void doOperation() {
        System.out.print("World!");
    }
}
