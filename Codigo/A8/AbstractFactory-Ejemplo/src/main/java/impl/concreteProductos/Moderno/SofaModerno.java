package impl.concreteProductos.Moderno;

import base.Productos.ISofa;

public class SofaModerno implements ISofa {
    @Override
    public void recostarse() {
        System.out.println("Recostado en el sofa");
    }

    @Override
    public String getEstilo() {
        return "Sofa estilo moderno";
    }
}
