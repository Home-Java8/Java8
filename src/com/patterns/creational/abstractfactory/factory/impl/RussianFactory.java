package com.patterns.creational.abstractfactory.factory.impl;

import com.patterns.creational.abstractfactory.factory.interfaces.TransportFactory;
import com.patterns.creational.abstractfactory.transport.interfaces.Aircraft;
import com.patterns.creational.abstractfactory.transport.interfaces.Car;
import com.patterns.creational.abstractfactory.transport.impl.car.Niva;
import com.patterns.creational.abstractfactory.transport.impl.aircraft.TU134;

// российские транспортные средства
public class RussianFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }

}
