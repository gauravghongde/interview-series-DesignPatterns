package ex1.invoker;

// abstract object which sends the request or command

import ex1.commands.ICommand;

public class DeviceButton {

    ICommand command;

    public DeviceButton(ICommand command) {
        this.command = command;
    }

    public void press() {
        this.command.execute();
    }

    public void pressUndo() {
        this.command.unExecute();
    }

}
