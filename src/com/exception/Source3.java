package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by alexandr on 10.06.15.
 * {@link http://www.quizful.net/post/java-exceptions}
 * ***************************************************
 * Наследование методов бросающих исключения
 * Основные правила обработки исключений
 */
public class Source3 {

    public static void main(String[] args) {
        SubClass sb = new SubClass();
        try {
            sb.start();
        } catch (FileNotFoundException e){}

    }
}


class SuperClass {
    public void start() throws IOException {
        throw new IOException("Not able to open file");
    }
}

class SubClass extends SuperClass {

    /**
     *
     * @throws FileNotFoundException
     *         If file not found
     */
    @Override
//    public void start() throws Exception { // Он не скомпилируется
    public void start() throws FileNotFoundException { // FileNotFoundException - наследник IOException
        throw new FileNotFoundException("Not able to start");
    }
}
