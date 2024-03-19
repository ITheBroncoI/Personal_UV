package AccesoDatos.impl.Conexion;

import AccesoDatos.base.BasesDeDatos;
import AccesoDatos.base.Conexion;
import AccesoDatos.impl.BasesDeDatos.MySQL;

public class ConexionMySQL extends Conexion {
    @Override
    public BasesDeDatos conectarBaseDeDatos() {
        return MySQL.getInstancia();
    }
}
