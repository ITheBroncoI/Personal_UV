package AccesoDatos;

import AccesoDatos.base.Conexion;
import AccesoDatos.impl.Conexion.ConexionMySQL;
import AccesoDatos.impl.Conexion.ConexionPostgres;

public class Prueba {
    public static void main(String[] args) {
        Conexion conexionMySQL = new ConexionPostgres();
        conexionMySQL.crearConexion();
    }
}
