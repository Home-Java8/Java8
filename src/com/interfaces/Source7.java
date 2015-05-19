//package com.interfaces;
//
///**
// * Created by alexandr on 19.05.15.
// */
//public class Source7 {
//
//    public static void main(String[] args) {
//        new Test().print();
//    }
//
//
//
//    public interface A {
//        void print();
//    }
//
//    public interface B {
//        default void print() {
//            System.out.println("interface B");
//        }
//    }
//
//    public class Test implements A, B {
//        B{
//            @Override
//            public void print(){
//            B.super.print();
//        }
//        }
//    }
//}
