package AccesoDatos.base;

import LogicaNegocios.base.Productos;

public interface BasesDeDatos {
    public void conectar();
    public void desconectar();
    public void insertarProducto(Productos producto);
}
