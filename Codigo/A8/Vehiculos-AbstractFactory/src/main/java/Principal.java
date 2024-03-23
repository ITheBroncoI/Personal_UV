import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HelpVehiculos helpVehiculos = new HelpVehiculos();
        int seleccion;

        System.out.println("=== FABRICA DE VEHICULOS ===");

        do {
            System.out.println("""
                    Selecciona el vehiculo:
                    1) Automovil
                    2) Scooter
                    """);
            seleccion = sc.nextInt();

            switch (seleccion) {
                case 1 -> helpVehiculos.crearVehiculo(sc, "automovil");
                case 2 -> helpVehiculos.crearVehiculo(sc, "scooter");
                default -> System.out.println("Opcion no valida");
            }
            System.out.println("""
                    ¿Desea agregar otro producto?
                    1) Si
                    2) No
                    """);
            seleccion = sc.nextInt();
        } while (seleccion != 2);
        
        helpVehiculos.desglosarPedido();
    }
}
