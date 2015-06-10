package com.exception.my;

/**
 * Created by alexandr on 10.06.15.
 */
public class ExampleException {

    public static void main(String[] args) {
        try {
            System.out.println( somthingException(-5) );
        } catch (MyException me){
            me.negativeValue();
        }
    }

    /**
     *
     * @param n
     * @return
     * @throws MyException
     *         входное значение ниже нуля
     */
    public static int somthingException(int n) throws MyException {
        if (n > 0) {
            return (100 / n);
        } else {
            throw new MyException(); //throw new MyException("входное значение ниже нуля!");
        }
    }

}
