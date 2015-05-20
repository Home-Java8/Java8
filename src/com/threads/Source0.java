package com.threads;

/**
 * Created by alexandr on 19.05.15.
 * {@link http://habrahabr.ru/company/luxoft/blog/157273/}
 * {@link http://habrahabr.ru/post/164487/}
 * {@link http://www.helloworld.ru/texts/comp/lang/java/java5/vol10/ch5.html}
 * ***************************************************************************************************
 * Обзор java.util.concurrent.*
 * Многопоточность в Java
 * {@link http://info.javarush.ru/translation/2014/10/27/Синхронизация-потоков-блокировка-объекта-и-блокировка-класса.html}
 ** (Java / Приемы синхронизации в java) http://www.quizful.net/interview/java/synchronization-techniques
 *
     1. Системная синхронизация с использованием wait/notify.
     Поток, который ждет выполнения каких-либо условий, вызывает у этого объекта метод wait, предварительно захватив его монитор. На этом его работа приостанавливается. Другой поток может вызвать на этом же самом объекте метод notify (опять же, предварительно захватив монитор объекта), в результате чего, ждущий на объекте поток "просыпается" и продолжает свое выполнение.
     2. Системная синхронизация с использованием join
     Метод join, вызванный у экземпляра класса Thread, позволяет текущему потоку остановиться до того момента, как поток, связаный с этим экземпляром, закончит работу.
     3. Использование классов из пакета java.util.concurrent,
     который предоставляет набор классов для организации межпоточного взаимодействия. Примеры таких классов - Lock, семафор (Semaphore), etc. Концепция данного подхода заключается в использовании атомарных операций и переменных.
 */

public class Source0 {

    static SomeThing mThing;

    public static void main(String[] args) {
        mThing = new SomeThing();

        Thread myThready = new Thread(mThing);	// Создание потока "myThready"
        myThready.start();				        // Запуск потока

        System.out.println("Главный поток завершён...");
    }


    static class SomeThing implements Runnable {
        public void run() { //Этот метод будет выполняться в побочном потоке
            System.out.println("Привет из побочного потока!");
        }
    }
}
