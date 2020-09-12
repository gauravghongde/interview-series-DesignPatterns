package ex1;

import ex1.commands.*;
import ex1.invoker.DeviceButton;
import ex1.receiver.IElectronicDevice;
import ex1.receiver.Radio;
import ex1.receiver.Television;

import java.util.ArrayList;
import java.util.List;

public class RemotePlayground {
    public static void main(String[] args) {
        IElectronicDevice television = new Television();

        // commands
        TurnDeviceOn tvOnCommand = new TurnDeviceOn(television);
        TurnDeviceOff tvOffCommand = new TurnDeviceOff(television);
        TurnDeviceVolumeUp tvVolumeUpCommand = new TurnDeviceVolumeUp(television);
        TurnDeviceVolumeDown tvVolumeDownCommand = new TurnDeviceVolumeDown(television);

        // Map Buttons with commands
        // Button mapping is not hard coded and is configurable to client
        DeviceButton onButton = new DeviceButton(tvOnCommand);
        DeviceButton offButton = new DeviceButton(tvOffCommand);
        DeviceButton volumeUpButton = new DeviceButton(tvVolumeUpCommand);
        DeviceButton volumeDownButton = new DeviceButton(tvVolumeDownCommand);

        // playAround with buttons (Actions)
        onButton.press();
        volumeUpButton.press();
        volumeUpButton.press();
        volumeDownButton.press();
        offButton.press();

        /* o/p
        TV is ON
        TV Volume is at 1
        TV Volume is at 2
        TV Volume is at 1
        TV is OFF
         */

        // ----------------------------------------------------------------------

        Radio myRadio = new Radio();
        Television myTelevision = new Television();

        List<IElectronicDevice> myDevices = new ArrayList<>();

        myDevices.add(myRadio);
        myDevices.add(myTelevision);

        TurnItAllOff turnAllDevicesOffCommand = new TurnItAllOff(myDevices);

        offButton = new DeviceButton(turnAllDevicesOffCommand);

        offButton.press();
        offButton.pressUndo();

        /* o/p
        Radio is OFF
        TV is OFF
        Radio is ON
        TV is ON
         */
    }
}
