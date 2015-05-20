//package com.threads;
//
//import com.google.common.base.Stopwatch;
//import java.util.concurrent.CountDownLatch;
//import java.util.concurrent.TimeUnit;
//
///**
// * Created by alexandr on 20.05.15.
// * {@link http://movejava.blogspot.com/2013/06/javautilconcurrentcountdownlatch.html}
// * ***************************************************************************************************
// * Использование защелок (java.util.concurrent.CountDownLatch)
// *
// * Защелки необходимы тогда, когда необходимо ускорить выполнение последовательных независимых задач за счет их распараллеливания. Раз уж я остановился на строительных примерах, то ситуацией их жизни может служить приготовление бетона.
// * В моем случае бетон состоит из 4 составляющих: песок, цемент, щебень и вода. Допустим, что все материалы для приготовления бетона находятся на разном расстоянии от екмкости, где его приготавливают.
// * При последовательном выполнении данных операций нам небходима сумма времени на выполнение каждой операции. Если у нас в распоряжении есть 4 работника, то время наполнения емкости, готовой к замесу, становится равно времени выполнения максимальной оперции.
// * Дополнительным условием для начала замеса является полное заполнение емкости.
// * Рассмотрим на примере кода.
// */
//
//// 1. Главный класс, где создаются работники и защелка на 4 события. Этот класс ожидает завершения работы всех работников (latch.await())
//public class Main {
//
//    public static void main(String[] args) throws InterruptedException {
//        Stopwatch sw = new Stopwatch();
//        sw.start();
//
//        CountDownLatch latch = new CountDownLatch(4);
//
//        new Worker(latch,"Sand").start();
//        new Worker(latch,"Cement").start();
//        new Worker(latch,"Water").start();
//        new Worker(latch,"Breakstone").start();
//
//        System.out.println("Waiting for all workers");
//        latch.await();
//        System.out.println("All workers finished. Now we can shake.");
//
//        sw.stop();
//        System.out.println("Program time: " + sw.elapsed(TimeUnit.MILLISECONDS) + " ms");
//    }
//
//}
//
//
//
//
//// 2. Класс для генерации случайного времени задержки  (время условно определяет удаленность материала от емкости)
//class RandomGenerator {
//    public static long getRandom(long min, long max) {
//        return min + (long)(Math.random() * (max - min + 1));
//    }
//}
//
//// 3.Класс работника, который выполняет задачу и извещает о выполнении
//class Worker extends Thread {
//
//    private CountDownLatch _cdl;
//    private String _name;
//
//    public Worker (CountDownLatch cdl, String name) {
//        _cdl = cdl;
//        _name = name;
//    }
//
//    @Override
//    public void run() {
//        Stopwatch sw = new Stopwatch();
//        sw.start();
//
//        System.out.println(_name + " working...");
//        try {
//            Thread.sleep(RandomGenerator.getRandom(500, 1000));
//        } catch (InterruptedException e) {
//            e.printStackTrace(System.err);
//        }
//        _cdl.countDown();
//
//        sw.stop();
//        System.out.println(_name + " time: " + sw.elapsed(TimeUnit.MILLISECONDS) + " ms");
//    }
//}
//
//
//// По результатам работы видно, что общее время выполнения программы 960 мс, а при последовательном выполнении мы б получили время, равное сумме: 720 + 887 + 927 + 959 = 3493 мс.
//// В данном примере использована библиотека guava для подсчета времени выполнения метода.
//// Примером для параллельного выполнения из мира Java может служить получение данных о клиенте. На входе в программу мы имеем некий userId клиента и из разных источников запрашиваем данные. Например, по http-запросу №1 мы получаем фамилию и имя клиента, запросом в базу данных год рождения и запросом №2 получаем список банковских счетов.