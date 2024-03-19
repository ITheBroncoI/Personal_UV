package LogicaNegocios.base;

import java.util.Arrays;
import java.util.List;

public abstract class FactoryProductos {
    public void createProducto (String nombre, String marca, String SKU) {
        if (checkMarca(marca)) {
            Productos productoNacional = crearProductoNacional(nombre, marca, SKU);
            productoNacional.insertarProducto(productoNacional);
        } else {
            Productos productoExtranjero = crearProductoExtranjero(nombre, marca, SKU);
            productoExtranjero.insertarProducto(productoExtranjero);
        }
    }

    private boolean checkMarca(String marca) {
        List<String> marcasNacionales = Arrays.asList("Bimbo", "Gamesa", "Corona", "Lala", "Jumex");
        return marcasNacionales.contains(marca);
    }

    protected abstract Productos crearProductoNacional(String nombre, String marca, String SKU);
    protected abstract Productos crearProductoExtranjero(String nombre, String marca, String SKU);
}
