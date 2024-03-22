package impl.concreteProductos.mac;

import base.elementos.ICheckbox;

public class MacCheckbox implements ICheckbox {
    @Override
    public void paint() {
        System.out.println("Checkbox estilo mac");
    }
}
