package com.patterns.creational.abstractfactory.factory.impl;

import com.patterns.creational.abstractfactory.factory.interfaces.TransportFactory;
import com.patterns.creational.abstractfactory.transport.interfaces.Aircraft;
import com.patterns.creational.abstractfactory.transport.impl.aircraft.Boeing747;
import com.patterns.creational.abstractfactory.transport.interfaces.Car;
import com.patterns.creational.abstractfactory.transport.impl.car.Porsche;

// американские транспортные средства
public class USAFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }

}
