package ex1.dialogFactory;

import ex1.button.IButton;
import ex1.button.WindowsButton;
import ex1.checkbox.ICheckbox;
import ex1.checkbox.WindowsCheckbox;

// concrete implementation of abstract factory
public class WindowsDialogFactory implements IDialogFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
