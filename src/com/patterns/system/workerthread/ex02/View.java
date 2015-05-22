package com.patterns.system.workerthread.ex02;

import java.io.IOException;

/**Product
 * (шаблон проектирования
 * Factory Method)<br>
 * Интерфейс "фабрикуемых"
 * @author Александр
 * Объявляем методы
 *отображения объектов
 */
public interface View {

    /**Отображает заголовок */
    public void viewHeader();

    /**Отображает основную часть */
    public void viewBody();

    /**Отображает окончание*/
    public void viewFooter();

    /**Отображает объект целиком*/
    public void viewShow();

    /**Отображает периметр*/
    public void viewP(int i);

    /**Отображает периметр*/
    public void viewPB(int i);

    /**Выполняет инициализацию*/
    public void viewInit(int i);

    /**Сохраняет данные для последующего восстановления*/
    public void viewSave() throws IOException;

    /**Востанавливает ранее сохраненные данные*/
    public void viewRestore() throws Exception;

    int getX();
    int getY();

//    AttributeSet getItems();
}
