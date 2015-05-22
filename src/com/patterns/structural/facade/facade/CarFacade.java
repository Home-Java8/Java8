package com.patterns.structural.facade.facade;

// фасад для работы 
import com.patterns.structural.facade.parts.Door;
import com.patterns.structural.facade.parts.Wheel;
import com.patterns.structural.facade.parts.Zazhiganie;

public class CarFacade {

    private Door door = new Door();
    private Zazhiganie zazhiganie = new Zazhiganie();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
    
        
    
}
