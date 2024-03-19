package LogicaNegocios.impl.Productos;

import AccesoDatos.base.Conexion;
import AccesoDatos.impl.Conexion.ConexionMySQL;
import AccesoDatos.impl.Conexion.ConexionPostgres;
import LogicaNegocios.base.Productos;

public class ProductoExtranjero implements Productos {
    // --- ATRIBUTOS ---
    private String nombre;
    private String marca;
    private String sku;

    // --- METODOS ---
    // CONSTRUCTORES
    public ProductoExtranjero(String nombre, String marca, String sku) {
        this.nombre = nombre;
        this.marca = marca;
        this.sku = sku;
    }

    // GET Y SET
    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public void insertarProducto(Productos producto) {
        Conexion conexion = new ConexionPostgres();
        conexion.insertarProducto(producto);
    }
}
