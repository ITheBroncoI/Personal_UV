package LogicaNegocios.impl.Productos;

import AccesoDatos.base.Conexion;
import AccesoDatos.impl.Conexion.ConexionMySQL;
import AccesoDatos.impl.Conexion.ConexionPostgres;
import LogicaNegocios.base.Productos;

public class ProductoExtranjero implements Productos {
    // --- ATRIBUTOS ---
    private String sku;
    private String nombre;
    private String marca;
    private double precio;
    private int existencias;

    // --- METODOS ---
    // CONSTRUCTORES
    public ProductoExtranjero(String sku, String nombre, String marca, double precio, int existencias) {
        this.sku = sku;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.existencias = existencias;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    @Override
    public void insertarProducto(Productos producto) {
        Conexion conexion = new ConexionPostgres();
        conexion.insertarProducto(producto);
    }
}
