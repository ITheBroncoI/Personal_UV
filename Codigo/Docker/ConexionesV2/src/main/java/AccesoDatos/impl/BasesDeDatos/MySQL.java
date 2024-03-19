package AccesoDatos.impl.BasesDeDatos;

import AccesoDatos.base.BasesDeDatos;
import LogicaNegocios.base.Productos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQL implements BasesDeDatos {
    // --- ATRIBUTOS ---
    private Connection connection;
    private static MySQL instancia;

    // --- METODOS ---
    // CONSTRUCTOR - SINGLETON
    private MySQL() {
    }

    // Metodo que devuelve la instancia del objeto - Singleton
    public static MySQL getInstancia() {
        if (instancia == null) {
            instancia = new MySQL();
        }
        return instancia;
    }

    @Override
    public void conectar() {
        String url = "jdbc:mysql://localhost:3306/productos";
        String usuario = "admin";
        String contrasena = "123456";

        try {
            // Asegurarse de que el driver JDBC esté cargado
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión a la base de datos
            connection = DriverManager.getConnection(url, usuario, contrasena);

            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
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
        String sql = "INSERT INTO productosNacionales (nombre, marca, SKU) VALUES (?, ?, ?)";
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
