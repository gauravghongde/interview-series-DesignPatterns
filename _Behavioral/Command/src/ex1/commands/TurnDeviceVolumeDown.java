package ex1.commands;

import ex1.receiver.IElectronicDevice;

public class TurnDeviceVolumeDown implements ICommand {

    IElectronicDevice electronicDevice;

    public TurnDeviceVolumeDown(IElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeDown();
    }

    @Override
    public void unExecute() {
        electronicDevice.volumeUp();
    }
}
