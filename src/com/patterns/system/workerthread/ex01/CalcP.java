package com.patterns.system.workerthread.ex01;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**Содержит реализацию методов для вычисления и отображения результатов для треугольника
 * @author Александр
 */
public class CalcP {
    private static final String FNAME = "Item2.bin";

    private Item2 result;

    public CalcP() {
        result = new Item2();
    }

    /**Установка значения ({@linkplain CalcT#result}) */
    public void setResult (Item2 result){
        this.result = result;
    }

    /**Получаем значения {@linkplain CalcT#result}}*/
    public Item2 getResult(){
        return result;
    }

    /**вычисляет значение периметра треугольника
     * @param x - основание треугольника
     * @param y - высота треугольника
     * @return - периметр треугольника
     */
    public double calcP (double x,double y){
        result.setP(2*(x+y));  //находжение площади треугольника
        return result.getP();
    }

    /**Вычисление функции и сохранение рельтата
     * результат в объекте {@linkplain CalcT#result}}
     * @param x - основание треугольника
     * @param y - высота треугольника
     */
    public void init(double x, double y){
        result.setXY(x,y);
        result.setP(calcP(x,y));
    }

    /**Вывод результата*/
    public void show(){
        System.out.println(result);
    }

    /**Получение периметра треугольника*/
    public double getP(){
        return result.getP();
    }

    /**Вывод результата в бинарной системе*/
    public void bin(){
        int b = 1;
        int i = 0;
        int p;
        double p_temp;
        p_temp = result.getP();
        p = (int)p_temp;
        while (p > 1 ){
            b = b*2;
            if (p - 2*b < 0){
                p = p - b;
                b = 1;
                i++;
            }
        }
        if (p == 1 ) i++;

        System.out.println(i);
    }

    /**Сохраняет {@linkplain CalcT#result}} В файле {@linkplain CalcT#FNAME}}
     * @throws IOException
     * */
    public void save() throws IOException{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(result);
        os.flush();
        os.close();
    }

    /**Восстанавливаем  {@linkplain CalcT#result} из файла {@linkplain CalcT#FNAME}
     * @throws IOException
     * */
    public void restore() throws Exception{
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        result = (Item2)is.readObject();
        is.close();
    }
}
