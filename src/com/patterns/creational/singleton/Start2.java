package com.patterns.creational.singleton;

/**
 * Created by Саша on 08.07.2014.
 */
public class Start2 {

    public static void main(String[] args) {
        TestSingleton2.getInstance().print();
        TestSingleton2.getInstance().print();
        TestSingleton2.getInstance().print();

        TestSingleton2.getInstance().stop();
    }
}