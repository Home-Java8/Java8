package com.threads;

import com.sun.org.apache.xalan.internal.lib.ExsltBase;

/**
 * Created by alexandr on 20.05.15.
 * {@link http://javaigrun.ru/2010/04/09/potoki-v-java/}
 * {@link http://www.darkraha.com/rus/java/api/jcls04.php}
 * {@link http://initialize.ru/vzaimodeistvie-mejdu-potikami-java}
 * ***************************************************************************************************
 * Определение потока в Java
 */
public class Source1 {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.run(); // Так можно (Метод просто выполнится), но новый поток не создастся.
        myThread.start();

        MyRunnable myRunnable1 = new MyRunnable("MyRunnable");
        Thread thread1 = new Thread(myRunnable1);
        thread1.start();


        NameRunnable nameRunnable = new NameRunnable();
        Thread one = new Thread(nameRunnable);
        Thread two = new Thread(nameRunnable);
        Thread three = new Thread(nameRunnable);
        one.setName("NameRunnable-1");
        two.setName("NameRunnable-2");
        three.setName("NameRunnable-3");
        one.start();
        two.start();
        three.start();

        NameRunnable2 nameRunnable2 = new NameRunnable2();
        Thread one2 = new Thread(nameRunnable2);
        Thread two2 = new Thread(nameRunnable2);
        Thread three2 = new Thread(nameRunnable2);
        one2.setName("NameRunnable-1.2");
        two2.setName("NameRunnable-2.2");
        three2.setName("NameRunnable-3.2");
        one2.start();
        two2.start();
        three2.start();


        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

//        myThread2.fWait = true; // возобновляем выполнение
//        try {
//            myThread2.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        myThread2.fWait = false; // приостанавливаем
//        System.out.println("(MyThread2) Стоп");

        while (true) {
            synchronized (myThread2) { // приостанавливаем
                System.out.println("приостанавливаем");
                myThread2.fWait = false;
            }
            try {
                myThread2.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (myThread2) { // возобновляем выполнение
                System.out.println("возобновляем выполнение");
                myThread2.fWait = true;
                myThread2.notify();
            }
        }


    }

}


class MyThread extends Thread {
    // переопределение метода "run" - разрешается!
    @Override
    public void run(){
        System.out.println("Очень важная работа выполняется в MyThread");
    }

    // перегрузка метода "run" - запрещается...
    public void run(String s) {
        System.out.println("Строка из метода run: " + s);
    }
}

class MyRunnable implements Runnable {
    private String name = null;

    public MyRunnable(String name){
        this.name = name;
    }

    @Override
    public void run(){
        System.out.println("Очень важная работа выполняется в " + name);
    }
}

class NameRunnable implements Runnable {
    @Override
    public void run(){
        for(int i =1; i <= 3; i++)
            System.out.println("NameRunnable запущен >> Выполняется '" + Thread.currentThread().getName() + "' >> (" + i + ")");
    }
}

class NameRunnable2 implements Runnable {
    @Override
    public void run(){
        synchronized(this) { // синхронизируемся на себе
            for (int i = 1; i <= 3; i++)
                System.out.println("NameRunnable2 запущен >> Выполняется-синхронизируемся '" + Thread.currentThread().getName() + "' >> (" + i + ")");
        }
    }
}

class MyThread2 extends Thread {
    public boolean fWait = true;

    @Override
    public void run(){
        int i = 0;
        System.out.println("(MyThread2) Запуск");

//        while (fWait) {
//            System.out.println("(MyThread2) Цыкл [" + i + "]");
//            i++;
//        }

        while (fWait) {
            System.out.println(">>> MyThread2 [" + i + "]");
            synchronized (this) { // синхронизируемся на себе
                try {
                    wait();
                } catch (Exception e) {}
            }
            i++;
        }
    }
}
