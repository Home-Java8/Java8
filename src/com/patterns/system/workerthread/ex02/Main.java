package com.patterns.system.workerthread.ex02;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**Вычисление и отобрежение результатов
* Содержит реализацию статического метода main()
* @author Александр
* @version 2.0
* @see Main@main
*/
public class Main {

    /**Объект, реализующий интерфейс {@linkplain View}};
     * обслуживает колеекцию объектов {@linkplain ex01.Item2}}
     */
    private View view;

    /**Инициализирует поле {@linkplain Main#view view}} */
    public Main(View view){
        this.view = view;
    }
    /**Отображает меню */
    private void menu() {
        String s = null;
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
                    System.out.println("Vvod ocnovaiya i visotu: ");
                    view.viewInit(1);
                    break;

                case '2':
                    System.out.println("Vvod dvuh storon pryamougolnika: ");
                    view.viewInit(2);
                    break;

                case '3':
                    System.out.println("Perimetr treugolnika = ");
                    view.viewP(1);
                    break;

                case '4':
                    System.out.println("Perimetr pryamougolnika = ");
                    view.viewP(2);
                    break;

                case '5':
                    System.out.println("Treugolnik ");
                    view.viewPB(1);
                    break;

                case '6':
                    System.out.println("Pryamougolnika ");
                    view.viewPB(2);
                    break;

                case '7':
                    System.out.println("Save current ");
                    try{
                        view.viewSave();
                    }catch(IOException e){
                        System.out.println("Treugolnik: Serialozation ERROE: " + e);
                    }
                    view.viewShow();
                    try{
                        view.viewSave();
                    }catch(IOException e){
                        System.out.println("Pryamougolnik: Serialozation ERROE: " + e);
                    }
                    break;

                case '8':
                    System.out.println("Restore last saved ");
                    try{
                        view.viewRestore();
                    }catch(Exception e){
                        System.out.println("Treugolnik: Serialozation ERROE: " + e);
                    }
                    view.viewShow();
                    try{
                        view.viewShow();
                    }catch(Exception e){
                        System.out.println("Pryamougolnik: Serialozation ERROE: " + e);
                    }
                    break;

                case '9':
                    System.out.println("Exit.");
                    break;
                default:System.out.print("Wround command:) ");
            }
        }while(s.charAt(0) != '9');
    }
    /**Выполняется при запуске программы */
    public static void main(String[] srgs){
        Main main = new Main(new ViewableResult().getView());
        main.menu();
    }
}
