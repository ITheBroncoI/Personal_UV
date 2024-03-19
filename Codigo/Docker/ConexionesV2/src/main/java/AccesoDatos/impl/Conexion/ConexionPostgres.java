package AccesoDatos.impl.Conexion;

import AccesoDatos.base.BasesDeDatos;
import AccesoDatos.base.Conexion;
import AccesoDatos.impl.BasesDeDatos.Postgres;

public class ConexionPostgres extends Conexion {
    @Override
    public BasesDeDatos conectarBaseDeDatos() {
        return Postgres.getInstancia();
    }
}
