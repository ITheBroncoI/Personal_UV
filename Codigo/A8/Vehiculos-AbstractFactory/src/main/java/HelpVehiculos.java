import base.factories.IFabricaVehiculos;
import base.vehiculos.IAutomovil;
import base.vehiculos.IScooter;
import impl.concreteFactories.ElectricoFactory;
import impl.concreteFactories.GasolinaFactory;

import java.util.*;

public class HelpVehiculos {
    // --- ATRIBUTOS ---
    List<IAutomovil> automoviles = new ArrayList<>();
    List<IScooter> scooters = new ArrayList<>();

    // --- METODOS ---
    public void crearVehiculo(Scanner scanner, String tipo) {
        System.out.println("""
                Selecciona el tipo de vehiculo:
                1) Electrico
                2) A Gasolina
                """);
        int seleccion = scanner.nextInt();

        IFabricaVehiculos fabrica = null;
        switch (seleccion) {
            case 1 -> fabrica = new ElectricoFactory();
            case 2 -> fabrica = new GasolinaFactory();
            default -> {
                System.out.println("Tipo no valido");
            }
        }

        switch (tipo) {
            case "automovil" -> automoviles.add(fabrica.crearAutomovil());
            case "scooter" -> scooters.add(fabrica.crearScooter());
            default -> System.out.println("Vehiculo no valido");
        }
    }

    public void desglosarPedido() {
        String tipoVehiculo;
        String[] tipos = {"Electrico", "Gasolina"};
        Map<String, Map<String, Integer>> conteoVehiculosPorTipo = new HashMap<>();

        for (String tipo : tipos) {
            Map<String, Integer> conteoVehiculos = new HashMap<>();
            conteoVehiculos.put("Automovil", 0);
            conteoVehiculos.put("Scooter", 0);
            conteoVehiculosPorTipo.put(tipo, conteoVehiculos);
        }

        for (IAutomovil automovil : automoviles) {
            tipoVehiculo = automovil.getClass().getName();
            for (String tipo : tipos) {
                if (tipoVehiculo.contains(tipo)) {
                    Map<String, Integer> conteoVehiculos = conteoVehiculosPorTipo.get(tipo);
                    conteoVehiculos.put("Automovil", conteoVehiculos.get("Automovil") + 1);
                    conteoVehiculosPorTipo.put(tipo, conteoVehiculos);
                    automovil.getMotor();
                    automovil.getVelocidad();
                }
            }
        }

        for (IScooter scooter : scooters) {
            tipoVehiculo = scooter.getClass().getName();
            for (String tipo : tipos) {
                if (tipoVehiculo.contains(tipo)) {
                    Map<String, Integer> conteoVehiculos = conteoVehiculosPorTipo.get(tipo);
                    conteoVehiculos.put("Scooter", conteoVehiculos.get("Scooter") + 1);
                    conteoVehiculosPorTipo.put(tipo, conteoVehiculos);
                    scooter.getMotor();
                    scooter.getVelocidad();
                }
            }
        }

        for (String tipo : tipos) {
            Map<String, Integer> conteoVehiculos = conteoVehiculosPorTipo.get(tipo);
            System.out.println("--- " + tipo.toUpperCase() + " ---");
            System.out.println("Automovile(s): " + conteoVehiculos.get("Automovil"));
            System.out.println("Scooter(s): " + conteoVehiculos.get("Scooter"));
            System.out.println();
        }
    }

}
