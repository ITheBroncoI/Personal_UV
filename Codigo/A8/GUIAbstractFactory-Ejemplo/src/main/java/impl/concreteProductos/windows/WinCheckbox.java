package impl.concreteProductos.windows;

import base.elementos.ICheckbox;

public class WinCheckbox implements ICheckbox {
    @Override
    public void paint() {
        System.out.println("Checkbox estilo windows");
    }
}
