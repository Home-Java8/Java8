package com.patterns.creational.abstractfactory.transport.impl.car;

import com.patterns.creational.abstractfactory.transport.interfaces.Car;

public class Niva implements Car{

    @Override
    public void drive() {
        System.out.println("Niva drive");
    }

    @Override
    public void stop() {
        System.out.println("Niva stopped");
    }
    
}
