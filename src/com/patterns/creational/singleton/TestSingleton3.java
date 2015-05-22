package com.patterns.creational.singleton;

/**
 * @author Aleksandr Konstantinovitch
 * @version 3.0
 * @date 08/07/2014
 * {@link http://programador.ru/gofdesign-patterns/}
 ******************************************************
 */
public class TestSingleton3 {

    private static final TestSingleton3 instance = new TestSingleton3();

    public static TestSingleton3 getInstance() {
        return instance;
    }

    private TestSingleton3() {
    }

    public void print(){
        System.out.println( this );
    }

    public void stop(){
        System.out.println( "stop" );
    }

}