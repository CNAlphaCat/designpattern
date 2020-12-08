package org.alphacat.designpattern.behavior.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<ICommand> commandList = new ArrayList<>();

    public void addCommand(ICommand command){
        commandList.add(command);
    }

    public void executeCommands(){
        for (ICommand order : commandList) {
            order.execute();
        }
        commandList.clear();
    }
}
