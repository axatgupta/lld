package org.example.behavioral.command;

import java.util.Stack;

public class CommandInvoker {
    private final Stack<Command> history = new Stack<>();

    public void execute(Command command){
        command.execute();
        history.push(command);
    }

    public void undo(){
        if(!history.empty()){
            history.pop().undo();
        }
    }
}
