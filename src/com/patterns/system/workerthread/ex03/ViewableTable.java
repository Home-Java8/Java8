package com.patterns.system.workerthread.ex03;

import com.patterns.system.workerthread.ex02.ViewableResult;
import com.patterns.system.workerthread.ex02.View;

/** ConcreteCreator
 * шаблон проектирования
 * Factory Method
 * Объявляет метод
 * "фабрикующий" объекты
 * @author Александр
 *@version 1.0
 *@see ViewableResult
 *@see ViewableTable#getView()
 */
public class ViewableTable extends ViewableResult {
    /** Создаёт отображаемый объект {@linkplain ViewTable} */
    @Override
    public View getView() {
        return new ViewTable();
    }

}