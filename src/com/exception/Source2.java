package com.exception;

/**
 * Created by alexandr on 10.06.15.
 * {@link http://www.quizful.net/post/java-exceptions}
 * ***************************************************
 * Исключения в Java
 */
public class Source2 {

    public static void main(String[] args) {
//        System.out.println(getAreaValue(-1, 100));

        int result = 0;
        try {
            result = getAreaValue(-1, 100);
        } catch(IllegalArgumentException e) {
            System.err.println("В метод вычисления площади был передан аргумент с негативным значением!");
//            throw e;
        }
        System.out.println("Result is : "+result);
    }

    public static int getAreaValue(int x, int y) throws IllegalArgumentException {
        if(x < 0 || y < 0)
            throw new IllegalArgumentException("value of 'x' or 'y' is negative: x="+x+", y="+y);
        return (x*y);
    }
}
