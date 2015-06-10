package com.exception.my;

/**
 * Created by alexandr on 10.06.15.
 */
public class MyException extends Exception {

    public MyException(){}
//    public MyException(String msg){
//        super(msg);
//    }

    public void negativeValue() {
        System.err.println("MyException: входное значение ниже нуля!");
    }

}
