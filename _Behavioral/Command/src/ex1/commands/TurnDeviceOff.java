package ex1.commands;

import ex1.receiver.IElectronicDevice;

public class TurnDeviceOff implements ICommand {

    IElectronicDevice electronicDevice;

    public TurnDeviceOff(IElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.off();
    }

    @Override
    public void unExecute() {
        electronicDevice.on();
    }
}
