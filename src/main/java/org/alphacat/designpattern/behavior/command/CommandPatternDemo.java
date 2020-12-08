package org.alphacat.designpattern.behavior.command;

public class CommandPatternDemo {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ICommand command1 = new ConcreteCommandA(receiver);
        ICommand command2 = new ConcreteCommandB(receiver);

        Invoker invoker = new Invoker();
        invoker.addCommand(command1);
        invoker.addCommand(command2);
        invoker.executeCommands();
    }
}
