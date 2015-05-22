package com.patterns.system.workerthread.ex02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.patterns.system.workerthread.ex01.CalcT;
import com.patterns.system.workerthread.ex01.Item1;
import com.patterns.system.workerthread.ex01.Item2;

/**ConctereProduct
* (шаблон проектирования
* Factory Method)<br>
* Вычисление функции
* @author Александр
* сохранение и отображение
*результатов
*@see View
*/
public class ViewResult implements View{

    /**Имя файла, используемого при сериализации*/
    private static final String FNAME = "items.bin";

    private static Item1 item = new Item1();

    private static Item2 item2 = new Item2();

    private static CalcT it = new CalcT();
    /**Определяет количество значений для вычисления по умолчанию*/
    private static final int DEFAULT_NUM = 10;

    public ViewResult(int defaultNum) {
// TODO Auto-generated constructor stub
    }
    /**Вызывает {@linkplain ViewResult#ViewResult(int) ViewResult(int n)}}
     * с параметром {@linkplain ViewResult#DEFAULT_NUM DEFAULT_NUM}}
     */
    public ViewResult(){
        this (DEFAULT_NUM);
    }

    /**Инициализация*/
    public double init (int st){
        double x = 1;
        double y = 1;
        double s = 0;
        double stepX;
        stepX = item.getX() + (double)st;
        item.setXY(x, y);
        if (stepX == 1 ){
            s = (y + Math.hypot(x/2, y) + Math.hypot(x/2, y));
        }else s = (y+x)*2;

        return s;
    }

    /**Иницализация*/
    public void viewInit(int i){
        if (i == 1 ) item.setP(init(i));
        else item2.setP(init(i));
    }

    /**Вывод период*/
    public void viewP(int i){
        if (i == 1) System.out.println("Perimetr =  " + item.getP());
        else System.out.println("Perimetr =  " + item2.getP());
    }


    /**Вывод количество единиц для твоичной системе*/
    public void viewPB(int j){
        System.out.print("Perimetr imeet ");

        int b = 1;
        int i = 0;
        int p;
        if (j == 1 )p = (int)item.getP();
        else p = (int)item2.getP();
        while (p > 1 ){
            b = b*2;
            if (p - 2*b < 0){
                p = p - b;
                b = 1;
                i++;
            }
        }
        if (p == 1 ) i++;
        System.out.print(i);
        System.out.println(" edinits");
    }
    /**Сохранение текущего*/
    public void viewSave() throws IOException{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(item);
        os.flush();
        os.close();
    }
    /**восстановление последнего*/
    public void viewRestore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        item = (Item1)is.readObject();
        is.close();
    }

    public void viewHeader() {
        System.out.println("Result: ");
    }

    public void viewBody(){
        System.out.printf("(%.0f; %.3f)",item.getX(), item.getP());
        System.out.println("End ");
    }

    public void viewShow(){
        viewHeader();
        viewBody();
        viewFooter();
    }

    /**Реализация метода */
    public void viewFooter() {
        System.out.println("End ");
    }

    public int getX() {
        return (int)item.getX();
    }
    public int getY() {
        return (int)item.getY();
    }

}
