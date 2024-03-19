package Presentacion;

import LogicaNegocios.base.FactoryProductos;
import LogicaNegocios.impl.FactoryProductos.ConcreteFactoryProductos;

public class Main {
    public static void main(String[] args) {
        FactoryProductos factoryProductos = new ConcreteFactoryProductos();
        factoryProductos.createProducto("Pan Blanco", "Bimbo", "SK4000");
        factoryProductos.createProducto("Galletas", "Oreo", "SL2001");
    }
}
