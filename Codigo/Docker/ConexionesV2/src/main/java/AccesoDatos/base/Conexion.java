package AccesoDatos.base;

import LogicaNegocios.base.Productos;

import java.util.ArrayList;
import java.util.List;

public abstract class Conexion {
    public void crearConexion() {
        BasesDeDatos basesDeDatos = conectarBaseDeDatos();
        basesDeDatos.conectar();
        basesDeDatos.desconectar();
    }

    public  void insertarProducto(Productos producto) {
        BasesDeDatos basesDeDatos = conectarBaseDeDatos();
        basesDeDatos.conectar();
        basesDeDatos.insertarProducto(producto);
        basesDeDatos.desconectar();
    }

    public List<Productos> obtenerProductos() {
        BasesDeDatos basesDeDatos = conectarBaseDeDatos();
        basesDeDatos.conectar();
        List<Productos> productos = basesDeDatos.obtenerProductos();
        basesDeDatos.desconectar();

        return  productos;
    }


    public abstract BasesDeDatos conectarBaseDeDatos();
}
