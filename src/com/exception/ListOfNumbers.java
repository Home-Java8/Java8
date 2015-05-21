package com.exception;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;

/**
 * Created by alexandr on 21.05.15.
 * ****************************************************
 * http://aectann.wikidot.com/java-exceptions-handling
 * http://kostin.ws/java/java-exceptions.html
 */
public class ListOfNumbers {

    private Vector vector;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        vector = new Vector(SIZE);
        for (int i = 0; i < SIZE; i++) {
            vector.addElement(new Integer(i));
        }
    }

    // Этот код не скомпилируется, т.к. конструктор FileWriter требует от нас обработать IOException. Правильно написанный код должен выглядеть примерно так:
//    public void writeList() {
//        //Необработанное контролируемое (checked) исключение IOException
//        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
//
//        for (int i = 0; i < SIZE; i++) {
//            // метод elementAt выбрасывает неконтролируемое исключение ArrayIndexOutOfBoundsException
//            out.println("Value at: " + i + " = " +
//                    vector.elementAt(i));
//        }
//
//        out.close();
//    }

    public void writeList() {
        PrintWriter out = null;
        try{
            //Необработанное контролируемое (checked) исключение IOException
            out = new PrintWriter(new FileWriter("OutFile.txt"));
            for (int i = 0; i < SIZE; i++) {
                // метод elementAt выбрасывает неконтролируемое исключение ArrayIndexOutOfBoundsException
                out.println("Value at: " + i + " = " + vector.elementAt(i));
            }
        } catch(IOException e){
            // Пытаемся как-то исправить ситуацию, если ошибка возникла при создании файла OutFile.txt
        } catch(Exception e){
            // В случае если в блоке try будет сгенерировано не IOException, то управление перейдет сюда
        } finally{
            // В любом случае нам необходимо закрыть файл.
            if(out!=null){
                out.close();
            }
        }
    }
}