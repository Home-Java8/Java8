package com.patterns.behavioral.command;

/**
 * Created by Саша on 13.07.2014.
 */
public class GoSouthCommand extends StepsCommand {
    @Override
    public void execute() {
        steps.goSouth();
    }
}