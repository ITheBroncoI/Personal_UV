package LogicaNegocios.impl.FactoryProductos;

import LogicaNegocios.base.FactoryProductos;
import LogicaNegocios.base.Productos;
import LogicaNegocios.impl.Productos.ProductoExtranjero;
import LogicaNegocios.impl.Productos.ProductoNacional;

public class ConcreteFactoryProductos extends FactoryProductos {

    @Override
    protected Productos crearProductoNacional(String nombre, String marca, String SKU) {
        return new ProductoNacional(nombre, marca, SKU);
    }

    @Override
    protected Productos crearProductoExtranjero(String nombre, String marca, String SKU) {
        return new ProductoExtranjero(nombre, marca, SKU);
    }
}
