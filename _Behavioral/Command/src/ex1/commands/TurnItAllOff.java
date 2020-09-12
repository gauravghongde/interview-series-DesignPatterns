package ex1.commands;

import ex1.receiver.IElectronicDevice;

import java.util.List;

public class TurnItAllOff implements ICommand {

    List<IElectronicDevice> electronicDevices;

    public TurnItAllOff(List<IElectronicDevice> electronicDevices) {
        this.electronicDevices = electronicDevices;
    }

    @Override
    public void execute() {
        for (IElectronicDevice electronicDevice : electronicDevices) {
            electronicDevice.off();
        }
    }

    @Override
    public void unExecute() {
        for (IElectronicDevice electronicDevice : electronicDevices) {
            electronicDevice.on();
        }
    }
}
