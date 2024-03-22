package impl.concreteFactories;

import base.elementos.IButton;
import base.elementos.ICheckbox;
import base.factories.GUIFactory;
import impl.concreteProductos.button.MacButton;
import impl.concreteProductos.checkbox.MacCheckbox;

public class MacFactory implements GUIFactory {
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ICheckbox createCheckBox() {
        return new MacCheckbox();
    }
}
