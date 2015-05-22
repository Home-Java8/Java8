package com.patterns.system.workerthread.ex03;

import java.util.Formatter;
import com.patterns.system.workerthread.ex01.Item1;
import com.patterns.system.workerthread.ex02.ViewResult;

/** ConcreteCreator
 * шаблон проектирования
 * Factory Method
 * Вывод в виде таблицы
 * @author Александр
 *@version 1.0
 *@see ViewResult
 */
public class ViewTable extends ViewResult{
    /** Определяем ширину таблицы по умолчанию */
    private static final int DEFAULT_WIGTH = 15;

    /** Текущая ширина таблицы */
    private int width;
    private int a;
    private int b;
    private int p;

    public ViewTable() {
        width = DEFAULT_WIGTH;
    }

    public ViewTable(int wigth){
        this.width = wigth;
    }

    public ViewTable(int width, int n){
        super(n);
        this.width = width;
    }

    public int setWidth( int width){
        return this.width = width;
    }

    public int seta( int a){
        return this.a = a;
    }
    public int setb( int b){
        return this.b = b;
    }
    public int setp( int p){
        return this.p = p;
    }

    public int getWidth(){
        return width;
    }

    public int geta(){
        return a;
    }

    public int getb(){
        return b;
    }
    public int getp(){
        return p;
    }

    private void outLine(){
        for(int i = width; i>0 ; i--){
            System.out.print('-');
        }
        System.out.print('\n');
    }

    private void outLineLn(){
        outLine();
        System.out.println();

    }

    private void outHeader(){
        Formatter fmt = new Formatter();
        fmt.format("%s%d%s%2$d%s%s","%",(width-4)/2,"s | %", "s | ","s\n");
        System.out.printf(fmt.toString(),"x                ","y               ","p                ");
        setWidth(50);
        outLine();
    }


    private void outBody(){
        Formatter fmt = new Formatter();
        System.out.println(geta() + "                   " + getb() + "                  " + getp());
        setWidth(50);
        outLine();

        Item1 item = new Item1();


//                           System.out.printf(item.getP());
    }

    /** Перегрузка метода суперкласса;
     * устанавливает поле {@linkplain ViewTable#width} значением <b>width</b><br>
     * Для объекта {@linkplain ViewTable} вызывает метод {@linkplain ViewTable#init(double stepX)}
     * @param width новая ширина таблицы.
     * @param stepX передается методу <b>init(int)</b>
     */
    public final void init(int width, int stepX, int stepX2) { // method overloading
        this.width = width;
        init(stepX, stepX2);
    }

    /** Переопределение (замещение, overriding) метода суперкласса;
     * выводит информационное сообщение и вызывает метод суперкласса
     * {@linkplain ViewResult#init(int stepX) init(int stepX)}<br>
     * {@inheritDoc}
     */
    public double init(int stepX, int stepX2) { // method overriding
        super.init(stepX);
        seta(stepX);
        setb(stepX2);
        stepX = 2*(stepX + stepX2);
        setp(stepX);
        return stepX;
    }


    /** Вывод элемента таблицы<br>{@inheritDoc} */
    @Override
    public void viewHeader() {
        outHeader();
        outLineLn();
    }

    /** Вывод элемента таблицы<br>{@inheritDoc} */
    @Override
    public void viewBody() {
        outBody();
    }

    /** Вывод элемента таблицы<br>{@inheritDoc} */
    @Override
    public void viewFooter() {
        outLineLn();
    }
}
