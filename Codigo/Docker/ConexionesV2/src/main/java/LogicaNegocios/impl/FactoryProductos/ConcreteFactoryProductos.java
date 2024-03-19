package LogicaNegocios.impl.FactoryProductos;

import LogicaNegocios.base.FactoryProductos;
import LogicaNegocios.base.Productos;
import LogicaNegocios.impl.Productos.ProductoExtranjero;
import LogicaNegocios.impl.Productos.ProductoNacional;

public class ConcreteFactoryProductos extends FactoryProductos {

    @Override
    protected Productos crearProductoNacional(String sku, String nombre, String marca, double precio, int existencias) {
        return new ProductoNacional(sku, nombre, marca, precio, existencias);
    }

    @Override
    protected Productos crearProductoExtranjero(String sku, String nombre, String marca, double precio, int existencias) {
        return new ProductoExtranjero(sku, nombre, marca, precio, existencias);
    }
}
