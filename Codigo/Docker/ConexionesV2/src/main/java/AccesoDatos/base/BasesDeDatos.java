package AccesoDatos.base;

import LogicaNegocios.base.Productos;
import java.util.List;

public interface BasesDeDatos {
     void conectar();
     void desconectar();
     void insertarProducto(Productos producto);
     List<Productos> obtenerProductos();
}
