package com.interfaces;

/**
 * Created by alexandr on 19.05.15.
 */
public class Source4 {

    public static void main(String[] args) {
        C c = new C();
        Test test = new Test();
        c.print();
        test.print();
    }


    public interface A {
        default void print(){
            System.out.println("interface A");
        }
    }

    public interface B {
        default void print(){
            System.out.println("interface B");
        }
    }

    public static class C implements A {}

    public static class Test extends C implements B {
        @Override
        public void print(){
            System.out.println("interface Test");
        }
    }

}
