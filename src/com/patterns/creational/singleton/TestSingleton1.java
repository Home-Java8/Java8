package com.patterns.creational.singleton;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 08/07/2014
 * {@link http://programador.ru/gofdesign-patterns/}
 ******************************************************
 */
public class TestSingleton1 {

    private static TestSingleton1 instance;

    public static TestSingleton1 getInstance() {
        if (instance==null) {
            instance = new TestSingleton1();
        }
        return instance;
    }
    
    private TestSingleton1() {
    }

    public void print(){
        System.out.println(this);
    }
    
    public void stop(){
        System.out.println("stop");
    }

}
