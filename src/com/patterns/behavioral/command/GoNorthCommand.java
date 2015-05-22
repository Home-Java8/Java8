package com.patterns.behavioral.command;

/**
 * Created by Саша on 13.07.2014.
 */
public class GoNorthCommand extends StepsCommand {
    @Override
    public void execute() {
        steps.goNorth();
    }
}