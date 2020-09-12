package ex1.commands;

import ex1.receiver.IElectronicDevice;

public class TurnDeviceOn implements ICommand {
    IElectronicDevice electronicDevice;

    public TurnDeviceOn(IElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.on();
    }

    @Override
    public void unExecute() {
        electronicDevice.off();
    }
}
