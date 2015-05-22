package com.patterns.creational.singleton;

/**
 * @author Aleksandr Konstantinovitch
 * @version 2.0
 * @date 08/07/2014
 * {@link http://programador.ru/gofdesign-patterns/}
 ******************************************************
 */
public class TestSingleton2 {

    public static TestSingleton2 instance;

    public static synchronized TestSingleton2 getInstance() {
        if( instance == null ) {
            instance = new TestSingleton2();
        }
        return instance;
    }

    private TestSingleton2() {
    }

    public void print(){
        System.out.println( this );
    }

    public void stop(){
        System.out.println( "stop" );
    }

}