package ex1;

import ex1.dialogFactory.IDialogFactory;
import ex1.dialogFactory.LinuxDialogFactory;
import ex1.dialogFactory.MacDialogFactory;
import ex1.dialogFactory.WindowsDialogFactory;

public class Application {

    private static GUI configureGUI() {
        // get instance of factory
        IDialogFactory dialogFactory;

        String osName = System.getProperty("os.name").toLowerCase();
        // choosing factory based upon conditions
        switch (osName) {
            case "mac":
                dialogFactory = new MacDialogFactory();
                break;
            case "windows 10":
                dialogFactory = new WindowsDialogFactory();
                break;
            default:
                dialogFactory = new LinuxDialogFactory();
                break;
        }
        //returns a GUI made as per OS
        return new GUI(dialogFactory);
    }

    public static void main(String[] args) {
        GUI appGUI = configureGUI();
        appGUI.render();

        /* o/p
        Windows Button Rendered
        Windows Checkbox Rendered
         */
    }

}
