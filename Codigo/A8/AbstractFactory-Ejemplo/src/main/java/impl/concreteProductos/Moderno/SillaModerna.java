package impl.concreteProductos.Moderno;

import base.Productos.ISilla;

public class SillaModerna implements ISilla {

    @Override
    public void sentarse() {
        System.out.println("Sentado en silla moderna");
    }

    @Override
    public String getEstilo() {
        return "Silla estilo moderna";
    }
}
