package com.patterns.structural.facade.objects;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 10/07/2014
 ******************************************************
 * Скрыть сложную внутреннюю реализацию и предоставить простой интерфейс
 */
import com.patterns.structural.facade.facade.CarFacade;
import com.patterns.structural.facade.parts.Door;
import com.patterns.structural.facade.parts.Wheel;
import com.patterns.structural.facade.parts.Zazhiganie;

public class Client {

    public static void main(String[] args) {
        // вызов без фасада
        Door door = new Door();
        door.open();

        Zazhiganie zazhiganie = new Zazhiganie();
        zazhiganie.fire();
        
        Wheel wheel = new Wheel();
        wheel.turn();
        

        // вызов с фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.go();



    }
}
