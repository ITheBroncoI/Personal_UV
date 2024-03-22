package impl.concreteFactories;

import base.elementos.IButton;
import base.elementos.ICheckbox;
import base.factories.GUIFactory;
import impl.concreteProductos.windows.WinButton;
import impl.concreteProductos.windows.WinCheckbox;

public class WinFactory implements GUIFactory {
    @Override
    public IButton createButton() {
        return new WinButton();
    }

    @Override
    public ICheckbox createCheckBox() {
        return new WinCheckbox();
    }
}
