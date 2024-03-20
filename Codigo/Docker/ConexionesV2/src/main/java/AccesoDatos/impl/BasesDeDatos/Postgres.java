package AccesoDatos.impl.BasesDeDatos;

import AccesoDatos.base.BasesDeDatos;
import LogicaNegocios.base.FactoryProductos;
import LogicaNegocios.base.Productos;
import LogicaNegocios.impl.FactoryProductos.ConcreteFactoryProductos;

import java.sql.*;
import java.util.ArrayList;

public class Postgres implements BasesDeDatos {
    // --- ATRIBUTOS ---
    private Connection connection;
    private static Postgres instancia;
    private final FactoryProductos factoryProductos = new ConcreteFactoryProductos();

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
        String sql = "INSERT INTO productosNacionales (SKU, nombre, marca, precio, existencias) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, producto.getSku());
            pstmt.setString(2, producto.getNombre());
            pstmt.setString(3, producto.getMarca());
            pstmt.setDouble(4, producto.getPrecio());
            pstmt.setInt(5, producto.getExistencias());
            pstmt.executeUpdate();
            System.out.println("Producto insertado correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar producto: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Productos> obtenerProductos() {
        ArrayList<Productos> productos = new ArrayList<>();
        String sql = "SELECT nombre, marca, sku FROM productosExtranjeros";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String sku = rs.getString("sku");
                String nombre = rs.getString("nombre");
                String marca = rs.getString("marca");
                double precio = rs.getDouble("precio");
                int existencia = rs.getInt("existencias");
                productos.add(factoryProductos.crearProductoSQL(sku, nombre, marca, precio, existencia));
            }
            System.out.println("Productos recuperados correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al recuperar productos: " + e.getMessage());
        }
        return productos;
    }
}
