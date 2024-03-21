package impl.concreteProductos.Victoriano;

import base.Productos.ISofa;

public class SofaVictoriano implements ISofa {
    @Override
    public void recostarse() {
        System.out.println("Recostado en el sofa");
    }

    @Override
    public String getEstilo() {
        return "Sofa estilo victoriana";
    }
}
