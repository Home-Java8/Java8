package com.patterns2.command;

/**
 ** {@link https://ru.wikipedia.org/wiki/%D0%9A%D0%BE%D0%BC%D0%B0%D0%BD%D0%B4%D0%B0_(%D1%88%D0%B0%D0%B1%D0%BB%D0%BE%D0%BD_%D0%BF%D1%80%D0%BE%D0%B5%D0%BA%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)}
 * {@link http://cpp-reference.ru/patterns/behavioral-patterns/command/}
 * {@link http://habrahabr.ru/post/114455/}
 * *******************************
 * Команда (шаблон проектирования)
 */

/*the Invoker class*/

public class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;

    public Switch(Command flipUpCmd,Command flipDownCmd){
        this.flipUpCommand=flipUpCmd;
        this.flipDownCommand=flipDownCmd;
    }

    public void flipUp(){
        flipUpCommand.execute();
    }

    public void flipDown(){
        flipDownCommand.execute();
    }
}

