import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Helper helper = new Helper();
        int seleccion;

        System.out.println("=== FABRICA DE MUEBLES ===");

        do {
            System.out.println("""
                    Seleccione el tipo de mueble:
                    1) Mesa
                    2) Silla
                    3) Sofa
                    """);
            seleccion = sc.nextInt();

            switch (seleccion) {
                case 1 -> helper.crearMueble(sc, "mesa");
                case 2 -> helper.crearMueble(sc, "silla");
                case 3 -> helper.crearMueble(sc, "sofa");
                default -> System.out.println("Opción no válida.");
            }

            System.out.println("""
                    ¿Desea agregar otro producto?
                    1) Si
                    2) No
                    """);
            seleccion = sc.nextInt();
        } while (seleccion != 2);

        helper.desglosarPedido();
    }
}
