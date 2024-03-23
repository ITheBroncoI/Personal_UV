import base.Factories.IFabricaMuebles;
import base.Productos.IMesa;
import base.Productos.ISilla;
import base.Productos.ISofa;
import impl.concreteFactories.*;

import java.util.*;

public class HelpeMueble {
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
        int seleccion = scanner.nextInt();

        IFabricaMuebles fabrica;
        switch (seleccion) {
            case 1 -> fabrica = new ArtDecoFactory();
            case 2 -> fabrica = new ModernoFactory();
            case 3 -> fabrica = new VictorianoFactory();
            default -> {
                System.out.println("Estilo no válido.");
                return;
            }
        }

        switch (tipo) {
            case "mesa" -> {
                IMesa mesa = fabrica.crearMesa();
                mesas.add(mesa);
                System.out.println("Numero de cosas a colocar en la mesa:");
                int num = scanner.nextInt();
                mesa.colocarCosas(num);
            }
            case "silla" -> sillas.add(fabrica.crearSilla());
            case "sofa" -> sofas.add(fabrica.crearSofa());
            default -> System.out.println("Tipo de mueble no válido.");
        }
    }

    public <T> void desglosarPedido() {
        String[] estilos = {"ArtDeco", "Moderno", "Victoriano"};
        Map<String, Map<String, Integer>> conteoMueblesPorEstilo = new HashMap<>();

        for (String estilo : estilos) {
            Map<String, Integer> conteoMuebles = new HashMap<>();
            conteoMuebles.put("Mesa", 0);
            conteoMuebles.put("Silla", 0);
            conteoMuebles.put("Sofa", 0);
            conteoMueblesPorEstilo.put(estilo, conteoMuebles);
        }

        for (IMesa mesa : mesas) {
            String tipoMueble = mesa.getClass().getName();
            for (String estilo : estilos) {
                if (tipoMueble.contains(estilo)) {
                    Map<String, Integer> conteoMuebles = conteoMueblesPorEstilo.get(estilo);
                    conteoMuebles.put("Mesa", conteoMuebles.get("Mesa") + 1);
                    conteoMueblesPorEstilo.put(estilo, conteoMuebles);
                    System.out.println("La mesa tiene " + mesa.getNoCosas() + " cosas");
                }
            }
        }

        for (ISilla silla : sillas) {
            String tipoMueble = silla.getClass().getName();
            for (String estilo : estilos) {
                if (tipoMueble.contains(estilo)) {
                    Map<String, Integer> conteoMuebles = conteoMueblesPorEstilo.get(estilo);
                    conteoMuebles.put("Silla", conteoMuebles.get("Silla") + 1);
                    conteoMueblesPorEstilo.put(estilo, conteoMuebles);

                }
            }
            silla.sentarse();
        }

        for (ISofa sofa : sofas) {
            String tipoMueble = sofa.getClass().getName();
            for (String estilo : estilos) {
                if (tipoMueble.contains(estilo)) {
                    Map<String, Integer> conteoMuebles = conteoMueblesPorEstilo.get(estilo);
                    conteoMuebles.put("Sofa", conteoMuebles.get("Sofa") + 1);
                    conteoMueblesPorEstilo.put(estilo, conteoMuebles);
                    sofa.recostarse();
                }
            }
        }

        for (String estilo : estilos) {
            Map<String, Integer> conteoMuebles = conteoMueblesPorEstilo.get(estilo);
            System.out.println("--- " + estilo.toUpperCase() + "---");
            System.out.println("Mesa(s): " + conteoMuebles.get("Mesa"));
            System.out.println("Silla(s): " + conteoMuebles.get("Silla"));
            System.out.println("Sofa(s): " + conteoMuebles.get("Sofa"));
            System.out.println();
        }
    }
}
