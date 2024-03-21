package impl.concreteProductos.Victoriano;

import base.Productos.ISilla;

public class SillaVictoriana implements ISilla {
    @Override
    public void sentarse() {
        System.out.println("Sentado en silla victoriana");
    }

    @Override
    public String getEstilo() {
        return "Silla estilo victoriana";
    }
}
