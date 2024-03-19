package Presentacion;

import LogicaNegocios.base.FactoryProductos;
import LogicaNegocios.impl.FactoryProductos.ConcreteFactoryProductos;

public class Main {
    public static void main(String[] args) {
        FactoryProductos factoryProductos = new ConcreteFactoryProductos();
        factoryProductos.createProducto("SK1001", "Pan blanco", "Bimbo", 30.0, 15);
    }
}
