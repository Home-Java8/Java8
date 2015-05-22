package com.patterns.system.workerthread.ex03;

import com.patterns.system.workerthread.ex02.View;

/**Вычисление и отобрежение результатов
 * Содержит реализацию статического метода main()
 * @author Александр
 * @version 3.0
 * @see Main#main
 */
public class Main extends com.patterns.system.workerthread.ex02.Main {

    /** Инициализирует поле {@linkplain LAB02.Main#view view} */
    public Main(View view) {
        super(view);
    }

    /** Выполняется при запуске программы;
     * вызывает метод {@linkplain LAB02.Main#menu menu()}
     * @param args - параметры запуска программы
     */
    public static void main(String[] args) {
        Main main = new Main(new ViewableTable().getView());
//main.menu();
        ViewTable i = new ViewTable();
        i.init(1, 2);
        i.viewHeader();
        i.viewBody();
        i.init(2, 3);
        i.viewBody();
        i.init(4, 5);
        i.viewBody();

    }
}
