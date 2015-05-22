package com.patterns.behavioral.command;

/**
 * Created by Саша on 13.07.2014.
 */
public class GoWestCommand extends StepsCommand {
    @Override
    public void execute() {
        steps.goWest();
    }
}