package com.patterns.creational.abstractfactory.factory.interfaces;

import com.patterns.creational.abstractfactory.transport.interfaces.Aircraft;
import com.patterns.creational.abstractfactory.transport.interfaces.Car;

// фабрика по созданию транспортных средств
public interface TransportFactory {
    
    // что фабрика будет производить
    
    Car createCar();// автомобили
    
    Aircraft createAircraft(); // самолеты

}
