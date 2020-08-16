package ex1.dialogFactory;

import ex1.button.IButton;
import ex1.button.LinuxButton;
import ex1.checkbox.ICheckbox;
import ex1.checkbox.LinuxCheckbox;

// concrete implementation of abstract factory
public class LinuxDialogFactory implements IDialogFactory {

    // Here we have control over combination of products (button & checkbox)

    @Override
    public IButton createButton() {
        return new LinuxButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
