package com.exception;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 21/05/2015
 ** {@link http://www.softzenware.com/java/10.htm}
 * {@link https://docviewer.yandex.ru/?uid=40270829&url=ya-mail%3A%2F%2F2370000006240542699%2F1.2&name=%D1%81%D1%81%D1%8B%D0%BB%D0%BA%D0%B8-2.txt&page=6&c=555d4d293b0c}
 * {@link https://docviewer.yandex.ru/?uid=40270829&url=ya-mail%3A%2F%2F2370000006240542699%2F1.2&name=%D1%81%D1%81%D1%8B%D0%BB%D0%BA%D0%B8-2.txt&page=7&c=555d51f88b85}
 ******************************************************
 * Обработка исключений
 * Только подклассы класса Throwable могут быть возбуждены или пере­хвачены. Простые типы — int, char и т.п., а также классы, не являю­щиеся подклассами Throwable, например, String и Object, использоваться в качестве исключений не могут.
 *
 * http://www.quizful.net/interview/java/exception-types
 * http://aectann.wikidot.com/java-exceptions-handling
 *
В Java исключения "Exception/RuntimeException" и ошибки "Errors" являются объектами.
Когда метод вызывает исключительную ситуацию (бросает - "throws") он работает только с теми объектами, которые наследуются от "Throwable".

Object
|
Throwable(CHECKED)
/ \
Error(UNCHECKED) Exception(CHECKED)
|
RuntimeException(UNCHECKED)

В Java есть два типа исключений:
1. "Checked" - это те исключения, которые обязательно должны обрабатываться блоком "catch" и обязательно указываются в сигнатуре метода.
Это события которые заранее предусмотреть нельзя, checked исключения наследуются от "Exception",
(Пример checked исключения: IOException)
2. "Unchecked" - это те исключения, которые могут не обязательно обрабатываться и не быть описанными.
Это события которые заранее можно и нужно предугадать. Unchecked исключения наследуются от "RuntimeException".
(Пример unchecked исключения: NullPointerException, ArrayIndexOutOfBoundsException, ClassCastExcpetion)
.. "Error" - (не в входят в иерархию Exception) можно попытаться отловить для завершающих действий программы
(как пример, логирование или запуск нового экземпляра приложения).
(Пример error исключения: OutOfMemoryError, NoClassDefFoundError, NoSuchMethodError, AssertionError, ThreadDeath)
 */
public class Source1 {

    public static void main(String[] args) {
        // Неперехваченные исключения:
        // Объекты-исключения автоматически создаются исполняющей средой Java в результате возникновения определенных исключительных состо­яний.
        // Например, очередная наша программа содержит выражение, при вычислении которого возникает деление на нуль.
        // ( Это подкласс класса Exception, а именно "ArithmeticException" )
//        int d = 0;
//        int a = 42 / d;

//        String str = null; //"null";
//        System.out.println(str.length());


//        try { // Для задания блока программного кода, который требуется защитить от исключений, исполь­зуется ключевое слово try.
//            int d = 0;
//            String str = null; //"null";
//
//            int a = 42 / d;
//            System.out.println(str.length());
//        } catch (ArithmeticException ae){ // catch, задающий тип исключения которое вы хотите обрабатывать
//            System.out.println("division by zero");
//        } catch (NullPointerException npe){ // catch, задающий тип исключения которое вы хотите обрабатывать
//            System.out.println("by null");
//        }


//        try {
//            int a = args.length;
//            System.out.println("a = " + a);
//            int b = 42 / a;
//            int c[] = { 1 };
//            c[42] = 99;
//        } catch (ArithmeticException e) {
//            System.out.println("div by 0: " + e);
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("array index oob: " + e);
//        }


        // Операторы try можно вкладывать друг в друга аналогично тому, как можно создавать вложенные области видимости переменных.
        // Если у оператора try низкого уровня нет раздела catch, соответствующего возбужденному исключению, стек будет развернут на одну ступень выше, и в поисках подходящего обработчика будут прове­рены разделы catch внешнего оператора try.
//        try {
//            int a = args.length;
//            System.out.println("a = " + a);
//            int b = 42 / a;
//
//            procedure();
//        } catch (ArithmeticException e) {
//            System.out.println("div by 0: " + e);
//        }


        // Оператор throw используется для возбуждения исключения «вруч­ную».
        // Для того, чтобы сделать это, нужно иметь объект подкласса клас­са Throwable, который можно либо получить как параметр оператора catch, либо создать с помощью оператора new.
        try {
            demoproc();
        } catch(NullPointerException npe) {
            System.out.println("[#1.2] recaught: " + npe);
        }

        System.out.println();

        // Если метод способен возбуждать исключения, которые он сам не об­рабатывает, он должен объявить о таком поведении, чтобы вызывающие методы могли защитить себя от этих исключений.
        // Для задания списка исключений, которые могут возбуждаться методом, используется ключе­вое слово throws.
        try {
            procedure2();
        } catch (IllegalAccessException iae) {
                System.out.println("[#2.2] caught " + iae);
        }

        System.out.println();


        // finally (здесь я перехватываю исключения)
        try {
            procA();
        } catch (RuntimeException re) {}
        procB();


//        throw new Error();
        f(new NullPointerException()); //f(null);
    }

    static void procedure() {
        try {
            int c[] = { 1 };
            c[42] = 99;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("array index oob: " + e);
        }
    }

    // ( Это пример того как я использую вложенные исключения... они будут обработаны согласно порядку вложенности... вверх по иерархии )
    // здесь метод имеет собственный блок "try/catch" внутри которого возбуждается исключение, который сперва перехватывает исключение а потом
    static void demoproc() {
        try {
            throw new NullPointerException("demo [#1.1]");
        } catch (NullPointerException npe) {
            System.out.println("[#1.1] caught inside demoproc");
            throw npe;
        }
    }

    // Для того, чтобы мы смогли оттранслировать этот пример, нам при­дется сообщить транслятору, что procedure может возбуждать исключе­ния типа IllegalAccessException и в методе main
    //
    static void procedure2() throws IllegalAccessException {
        System.out.println("[#2.1] inside procedure");
        throw new IllegalAccessException("demo [#2.1]");
    }


    static void procA() { // finally (здесь я бросаю исключения)
        try {
            System.out.println("inside procA");
            throw new RuntimeException("demo");
        } finally {
            System.out.println("procA's finally");
        }
    }
    static void procB() { // finally (здесь просто перехватываю исключения)
        try {
            System.out.println("inside procB");
            return;
        } finally {
            System.out.println("procB's finally");
        }
    }

    // эта функция в любом случае будет бросать исключение NullPointerException и его-же потом ловить - то есть, это зацыклит программу (и вызовет переполнение стека...)
    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException npe) {
            f(npe);
        }
    }
}
