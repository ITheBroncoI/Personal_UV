package impl.concreteProductos.mac;

import base.elementos.IButton;

public class MacButton implements IButton {
    @Override
    public void paint() {
        System.out.println("Boton estilo mac");
    }
}
