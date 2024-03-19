package LogicaNegocios.impl.Productos;

import AccesoDatos.base.Conexion;
import AccesoDatos.impl.Conexion.ConexionMySQL;
import LogicaNegocios.base.Productos;

public class ProductoNacional implements Productos {
    // -- ATRIBUTOS --
    private String nombre;
    private String marca;
    private String sku;

    // -- METODOS --
    // CONSTRUCTORES
    public ProductoNacional(String nombre, String marca, String sku) {
        this.nombre = nombre;
        this.marca = marca;
        this.sku = sku;
    }

    // GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public void insertarProducto(Productos producto) {
        Conexion conexion = new ConexionMySQL();
        conexion.insertarProducto(producto);
    }
}
