package ex1.dialogFactory;

import ex1.button.IButton;
import ex1.button.MacButton;
import ex1.checkbox.ICheckbox;
import ex1.checkbox.MacCheckbox;

// concrete implementation of abstract factory
public class MacDialogFactory implements IDialogFactory {
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new MacCheckbox();
    }
}
