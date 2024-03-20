package LogicaNegocios.impl.HelpMarcas;

import AccesoDatos.base.Conexion;
import AccesoDatos.impl.Conexion.ConexionMySQL;
import AccesoDatos.impl.Conexion.ConexionPostgres;
import LogicaNegocios.base.HelpMarcas;
import LogicaNegocios.base.Productos;

import java.util.List;

public class HelpMarca implements HelpMarcas {

    private void imprimirProductos(List<Productos> productos) {
        for (Productos producto : productos) {
            System.out.println("SKU: " + producto.getSku() +
                    " | Nombre: " + producto.getNombre() +
                    " | Marca: " + producto.getMarca() +
                    " | Precio: $" + producto.getPrecio() +
                    " | Existencias: " + producto.getExistencias());
        }
    }

    @Override
    public void obtenerProductosNacionales() {
        Conexion conexion = new ConexionMySQL();
        List<Productos> productosNacionales = conexion.obtenerProductos();
        imprimirProductos(productosNacionales);
    }

    @Override
    public void obtenerProductosExtranjeros() {
        Conexion conexion = new ConexionPostgres();
        List<Productos> productosExtranjeros = conexion.obtenerProductos();
        imprimirProductos(productosExtranjeros);
    }
}

