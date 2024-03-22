package base.factories;

import base.elementos.IButton;
import base.elementos.ICheckbox;

public interface GUIFactory {
    IButton createButton();
    ICheckbox createCheckBox();
}
