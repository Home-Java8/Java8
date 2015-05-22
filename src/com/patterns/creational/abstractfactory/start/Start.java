package com.patterns.creational.abstractfactory.start;

import com.patterns.creational.abstractfactory.factory.impl.RussianFactory;
import com.patterns.creational.abstractfactory.factory.impl.USAFactory;
import com.patterns.creational.abstractfactory.factory.interfaces.TransportFactory;

public class Start {
    
    private static TransportFactory factory;
    
    public static void main(String[] args) {
      
        if (true){
            factory = new RussianFactory();
        }else{
            factory = new USAFactory();
        }
        
        
        factory.createAircraft();
        factory.createCar();
        
        
    }

}
