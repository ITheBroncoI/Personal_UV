package impl.concreteProductos.button;

import base.elementos.IButton;

public class WinButton implements IButton {
    @Override
    public void paint() {
        System.out.println("Boton estilo windows");
    }
}
