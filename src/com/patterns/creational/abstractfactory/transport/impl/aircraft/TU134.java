package com.patterns.creational.abstractfactory.transport.impl.aircraft;

import com.patterns.creational.abstractfactory.transport.interfaces.Aircraft;

public class TU134 implements Aircraft{

    @Override
    public void flight() {
        System.out.println("TU-134 flight!");
    }

    
    
}
