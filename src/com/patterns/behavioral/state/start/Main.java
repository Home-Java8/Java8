package com.patterns.behavioral.state.start;

/**
 * @author Aleksandr Konstantinovitch
 * @version 1.0
 * @date 12/07/2014
 */
import com.patterns.behavioral.state.context.TransformerContext;
import com.patterns.behavioral.state.state.FireState;
import com.patterns.behavioral.state.state.MoveState;
import com.patterns.behavioral.state.state.TransformerState;

public class Main {

    public static void main(String[] args) {

        TransformerContext context = new TransformerContext();
        
        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
        
    }
}
