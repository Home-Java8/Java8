package com.interfaces;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 19/05/2015
 * {@link http://habrahabr.ru/post/216431/}
 ******************************************************
 * Новое в Java 8
 */
public class Source1 {

    public static void main(String[] args) {
        Test test = new Test();
        test.print();
    }



    public interface A {
        default void print(){
            System.out.println("interface A");
        }
    }

    public static class Test implements A {}
}
