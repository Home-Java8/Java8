package com.patterns.creational.singleton;

/**
 * Created by Саша on 08.07.2014.
 */
public class Start1 {

    public static void main(String[] args) {
        TestSingleton1.getInstance().print();
        TestSingleton1.getInstance().print();
        TestSingleton1.getInstance().print();
        
        TestSingleton1.getInstance().stop();
    }
}