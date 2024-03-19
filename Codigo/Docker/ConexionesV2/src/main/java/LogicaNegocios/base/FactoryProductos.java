package LogicaNegocios.base;

import java.util.Arrays;
import java.util.List;

public abstract class FactoryProductos {
    public void createProducto (String sku, String nombre, String marca, double precio, int existencias) {
        if (checkMarca(marca)) {
            Productos productoNacional = crearProductoNacional(sku, nombre, marca, precio, existencias);
            productoNacional.insertarProducto(productoNacional);
        } else {
            Productos productoExtranjero = crearProductoExtranjero(sku, nombre, marca, precio, existencias);
            productoExtranjero.insertarProducto(productoExtranjero);
        }
    }

    private boolean checkMarca(String marca) {
        List<String> marcasNacionales = Arrays.asList("Bimbo", "Gamesa", "Corona", "Lala", "Jumex");
        return marcasNacionales.contains(marca);
    }

    protected abstract Productos crearProductoNacional(String sku, String nombre, String marca, double precio, int existencias);
    protected abstract Productos crearProductoExtranjero(String sku, String nombre, String marca, double precio, int existencias);
}
