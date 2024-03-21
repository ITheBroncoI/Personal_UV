import base.Factories.IFabricaMuebles;
import base.Productos.IMesa;
import base.Productos.ISilla;
import base.Productos.ISofa;
import impl.concreteFactories.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helper {
    // --- ATRIBUTOS ---
    List<IMesa> mesas = new ArrayList<>();
    List<ISilla> sillas = new ArrayList<>();
    List<ISofa> sofas = new ArrayList<>();

    // --- METODOS ---
    public void crearMueble(Scanner scanner, String tipo) {
        System.out.println("""
                Selecciona el estilo del mueble:
                1) ArtDeco
                2) Moderno
                3) Victoriano
                """);
        int seleccionEstilo = scanner.nextInt();

        IFabricaMuebles fabrica;
        switch (seleccionEstilo) {
            case 1 -> fabrica = new ArtDecoFactory();
            case 2 -> fabrica = new ModernoFactory();
            case 3 -> fabrica = new VictorianoFactory();
            default -> {
                System.out.println("Estilo no válido.");
                return;
            }
        }

        switch (tipo) {
            case "mesa" -> mesas.add(fabrica.crearMesa());
            case "silla" -> sillas.add(fabrica.crearSilla());
            case "sofa" -> sofas.add(fabrica.crearSofa());
            default -> System.out.println("Tipo de mueble no válido.");
        }
    }

    public <T> void desglosarPedido(List<T> muebles, String tipo) {
        int contArtDeco = 0;
        int contModerno = 0;
        int contVictoriano = 0;

        for (T mueble : muebles) {
            String tipoMueble = mueble.getClass().getSimpleName();
            switch (tipoMueble) {
                case "MesaArtDeco", "SillaArtDeco", "SofaArtDeco" -> contArtDeco++;
                case "MesaModerna", "SillaModerna", "SofaModerno" -> contModerno++;
                case "MesaVictoriana", "SillaVictoriana", "SofaVictoriano" -> contVictoriano++;
            }
        }

        System.out.println("--- " + tipo.toUpperCase() + " ---");
        System.out.println("Mesa(s): " + contArtDeco);
        System.out.println("Silla(s): " + contModerno);
        System.out.println("Sofa(s): " + contVictoriano);
        System.out.println();
    }

    public void desglosarPedido() {
        desglosarPedido(mesas, "Art Deco");
        desglosarPedido(sillas, "Moderno");
        desglosarPedido(sofas, "Victoriano");
    }
}
