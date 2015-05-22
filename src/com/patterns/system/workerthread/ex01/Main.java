package com.patterns.system.workerthread.ex01;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**Вычисление и отображение результатов
 * Содержит реализацию статического метода main()
 * @author Александр
 * @see Main#main(String[])
 */
public class Main {
    /**Объект класса {@linkplain CalcT}*/
    private CalcT calcT =new CalcT();
    /**Объект класса {@linkplain CalcP}*/
    private CalcP calcP = new CalcP();

    /**Отображаем меню*/
    private void menu() throws Exception {
        String s = null;
        double x,y;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in ));
        do{
            do{
                System.out.println("Enter Command: ");
                System.out.println("1 - Vvod Treugolnik");
                System.out.println("2 - Vvod Pryamougolnik");
                System.out.println("3 - Vivod perimetra Treugolnika");
                System.out.println("4 - Vivod perimetra Pryamougolnika");
                System.out.println("5 - Vivod perimetra Treugolnika BIN");
                System.out.println("6 - Vivod perimetra Pryamougolnika BIN");
                System.out.println("7 - Save");
                System.out.println("8 - Restore");
                System.out.println("9 - Exit");

                try{
                    s = in.readLine();
                } catch(IOException e){
                    System.out.println("Error: " + e);
                    System.exit(0);
                }
            }while (s.length() != 1);

            switch (s.charAt(0)) {
                case '1':
                    System.out.println("Vvedite ocnovaiye i visotu: ");
                    x = Double.parseDouble(in.readLine());
                    y = Double.parseDouble(in.readLine());
                    calcT.init(x,y);
                    calcT.show();
                    break;

                case '2':
                    System.out.println("Vvedite dve storoni: ");
                    x = Double.parseDouble(in.readLine());
                    y = Double.parseDouble(in.readLine());
                    calcP.init(x,y);
                    calcP.show();
                    break;

                case '3':
                    System.out.println("Perimetr treugolnika = " + calcT.getP());
                    calcT.show();
                    break;

                case '4':
                    System.out.println("Perimetr pryamougolnika = " + calcT.getP());
                    calcP.show();
                    break;

                case '5':
                    System.out.print("Edinits v perimetre treugolnika = ");
                    calcT.bin();
                    break;

                case '6':
                    System.out.print("Edinits v perimetr pryamougolnika = ");
                    calcP.bin();
                    break;

                case '7':
                    System.out.println("Save current ");
                    try{
                        calcT.save();
                    }catch(IOException e){
                        System.out.println("Treugolnik: Serialozation ERROE: " + e);
                    }
                    calcT.show();
                    try{
                        calcP.save();
                    }catch(IOException e){
                        System.out.println("Pryamougolnik: Serialozation ERROE: " + e);
                    }
                    calcP.show();
                    break;

                case '8':
                    System.out.println("Restore last saved ");
                    try{
                        calcT.restore();
                    }catch(IOException e){
                        System.out.println("Treugolnik: Serialozation ERROE: " + e);
                    }
                    calcT.show();
                    try{
                        calcP.restore();
                    }catch(IOException e){
                        System.out.println("Pryamougolnik: Serialozation ERROE: " + e);
                    }
                    calcP.show();
                    break;

                case '9':
                    System.out.println("Exit.");
                    System.out.println(calcT.getResult().getP());
                    break;
                default:System.out.print("Wround command:) ");
            }
        }while(s.charAt(0) != '9');
    }

    /**Выполняется при запуске програмы
     * Вычисляется значение периметров треугольника и прямоугольника
     * @param srgs - параметры запуска программы
     */
    public static void main(String[] srgs) throws Exception{

        Main main = new Main();
        main.menu();
    }
}
