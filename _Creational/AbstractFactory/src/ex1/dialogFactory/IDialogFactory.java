package ex1.dialogFactory;

import ex1.button.IButton;
import ex1.checkbox.ICheckbox;

public interface IDialogFactory {
    // families of products,
    // intended to provide a dialog, which has combinations of products that make sense together
    IButton createButton();

    ICheckbox createCheckbox();
}
