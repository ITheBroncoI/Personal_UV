package LogicaNegocios.base;

public interface Productos {

    String getNombre();
    String getMarca();
    String getSku();
    void insertarProducto(Productos producto);
}
