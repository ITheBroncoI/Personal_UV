package LogicaNegocios.base;

public interface Productos {

    String getNombre();
    String getMarca();
    String getSku();
    double getPrecio();
    int getExistencias();

    void insertarProducto(Productos producto);
}
