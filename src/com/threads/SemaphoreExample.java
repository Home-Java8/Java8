package com.threads;


import java.util.concurrent.Semaphore;

/**
 * Created by alexandr on 20.05.15.
 * {@link http://movejava.blogspot.com/2013/06/javautilconcurrentsemaphore.html}
 * ***************************************************************************************************
 * Использование семафоров (java.util.concurrent.Semaphore)
 *
 * Семафоры используются для того, чтоб перед использованием ресурса проверить его доступность.
 * Примером из жизни может служить тележка (общий ресурс) и два работника (потоки java). Один работник, к примеру, наполняет тележку песком. В это время второй работник, который перевозит груз и затем разгружает, не может взять тележку и отвезти ее.
 * В то же время, если второй работник увез тележку, то первый работник не должен ничего наполнять.
 * Ниже приведен небольшой пример программы из 3 классов.
 */

// 1. Главнй класс
public class SemaphoreExample {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        new Worker(semaphore, "Adder", true).start();
        new Worker(semaphore, "Reducer", false).start();
    }

}





// 2. Класс тележки
class Cart {
    private static int weight = 0;

    public static void addWeight(){
        weight--;
    }

    public static void reduceWeight(){
        weight++;
    }

    public static int getWaight(){
        return weight;
    }
}

// 3. Класс работника (boolean переменная определяет это работник по загрузке тележки либо по разгрузке)
class Worker extends Thread {
    private Semaphore semaphore;
    private String workerName;
    private boolean isAdder;

    public Worker(Semaphore semaphore, String workerName, boolean isAdder) {
        this.semaphore = semaphore;
        this.workerName = workerName;
        this.isAdder = isAdder;
    }

    @Override
    public void run() {
        System.out.println(workerName + " started working...");
        try {
            System.out.println(workerName + " waiting for cart...");
            semaphore.acquire();
            System.out.println(workerName + " got access to cart...");
            for (int i = 0 ; i < 10 ; i++) {
                if (isAdder)
                    Cart.reduceWeight();
                else
                    Cart.addWeight();

                System.out.println(workerName + " changed weight to: " + Cart.getWaight());
                Thread.sleep(10L);
            }
            semaphore.release();
            System.out.println(workerName + " finished working with cart...");
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
    }
}
