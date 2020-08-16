package ex1;

import ex1.button.IButton;
import ex1.checkbox.ICheckbox;
import ex1.dialogFactory.IDialogFactory;

// This is a factory User
// It doesn't care about the OS
// It just delegates the work to factories
public class GUI {
    private final IButton button;
    private final ICheckbox checkbox;

    GUI(IDialogFactory dialogFactory) {
        // these are multiple products
        // GUI doesn't know which concrete factory it is talking to
        button = dialogFactory.createButton();
        checkbox = dialogFactory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }
}
