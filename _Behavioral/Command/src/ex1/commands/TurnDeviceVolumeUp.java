package ex1.commands;

import ex1.receiver.IElectronicDevice;

public class TurnDeviceVolumeUp implements ICommand {

    IElectronicDevice electronicDevice;

    public TurnDeviceVolumeUp(IElectronicDevice electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        electronicDevice.volumeUp();
    }

    @Override
    public void unExecute() {
        electronicDevice.volumeDown();
    }
}
