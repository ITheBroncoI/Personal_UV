package AccesoDatos.base;

import LogicaNegocios.base.Productos;

public abstract class Conexion {
    public void crearConexion() {
        BasesDeDatos basesDeDatos = conectarBaseDeDatos();
        basesDeDatos.conectar();
    }

    public  void insertarProducto(Productos producto) {
        BasesDeDatos basesDeDatos = conectarBaseDeDatos();
        basesDeDatos.conectar();
        basesDeDatos.insertarProducto(producto);
        basesDeDatos.desconectar();
    }

    public abstract BasesDeDatos conectarBaseDeDatos();
}
