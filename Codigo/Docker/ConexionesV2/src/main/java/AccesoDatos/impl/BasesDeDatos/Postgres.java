package AccesoDatos.impl.BasesDeDatos;

import AccesoDatos.base.BasesDeDatos;
import LogicaNegocios.base.Productos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Postgres implements BasesDeDatos {
    // --- ATRIBUTOS ---
    private Connection connection;
    private static Postgres instancia;

    // --- METODOS ---
    // CONSTRUCTOR - SINGLETON
    private Postgres() {
    }

    // Metodo que devuelve la instancia del objeto - Singleton
    public static Postgres getInstancia() {
        if (instancia == null) {
            instancia = new Postgres();
        }
        return instancia;
    }

    @Override
    public void conectar() {
        String url = "jdbc:postgresql://localhost/productos";
        String usuario = "postgres";
        String contrasena = "3004";

        try {
            // Establecer la conexión a la base de datos
            connection = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("Conexión exitosa a la base de datos PostgreSQL.");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos PostgreSQL: " + e.getMessage());
        }
    }

    @Override
    public void desconectar() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada con éxito.");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    @Override
    public void insertarProducto(Productos producto) {
        String sql = "INSERT INTO productosextranjeros (nombre, marca, SKU) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, producto.getNombre());
            pstmt.setString(2, producto.getMarca());
            pstmt.setString(3, producto.getSku());
            pstmt.executeUpdate();
            System.out.println("Producto insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar producto: " + e.getMessage());
        }
    }
}
