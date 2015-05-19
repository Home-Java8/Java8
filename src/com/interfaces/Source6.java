package com.interfaces;

/**
 * Created by alexandr on 19.05.15.
 */
public class Source6 {

    public static void main(String[] args) {
        Test test = new Test();
        test.print();
    }



    public interface A {
        default void print() {
            System.out.println("interface A");
        }
    }

    public interface B extends A {
        default void print() {
            System.out.println("interface B");
        }
    }

    public static class C implements A {
        @Override
        public void print() {
            System.out.println("class C");
        }
    }

    public static class Test extends C implements A, B {}
}
