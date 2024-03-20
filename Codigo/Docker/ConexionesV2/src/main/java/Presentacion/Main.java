package Presentacion;

import LogicaNegocios.base.FactoryProductos;
import LogicaNegocios.base.HelpMarcas;
import LogicaNegocios.impl.FactoryProductos.ConcreteFactoryProductos;
import LogicaNegocios.impl.HelpMarcas.HelpMarca;

import java.util.Scanner;

public class Main {

    // Variables estaticas
    static String sku;
    static String nombre;
    static String marca;
    static double precio;
    static int existencias;
    static int seleccion = 0;
    static  FactoryProductos factoryProductos = new ConcreteFactoryProductos();
    static HelpMarcas helpMarcas = new HelpMarca();

    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("""
                    Selecciona una opcion para comenzar
                    1) Agregar productos
                    2) Mostrar productos
                    3) Salir
                    """);
            seleccion = sc.nextInt();
            sc.nextLine();
            switch (seleccion) {
                case 1 -> agregarProducto(sc);
                case 2 -> {
                    System.out.println("""
                            Selecciona el tipo de productos a listar
                            1) Nacionales
                            2) Extranjeros
                            """);
                    seleccion = sc.nextInt();
                    switch (seleccion) {
                        case 1 -> helpMarcas.obtenerProductosNacionales();
                        case 2 -> helpMarcas.obtenerProductosExtranjeros();
                    }
                }
            }
        } while (seleccion != 3);
    }

    public static void agregarProducto(Scanner sc) {
        System.out.println("Digita el sku del producto:");
        sku = sc.nextLine();
        System.out.println("Digita el nombre del producto:");
        nombre = sc.nextLine();
        System.out.println("""
                Elige la marca perteneciente al producto:
                1) Bimbo
                2) Gamesa
                3) Corona
                4) Lala
                5) Jumex
                6) Coca Cola
                7) Sabritas
                8) Hersheys
                9) Pepsi
                10) Nescafe
                """);
        seleccion = sc.nextInt();
        switch (seleccion) {
            case 1 -> marca = "Bimbo";
            case 2 -> marca = "Gamesa";
            case 3 -> marca = "Corona";
            case 4 -> marca = "Lala";
            case 5 -> marca = "Jumex";
            case 6 -> marca = "Coca Cola";
            case 7 -> marca = "Sabritas";
            case 8 -> marca = "Hersheys";
            case 9 -> marca = "Pepsi";
            case 10 -> marca = "Nescafe";
        }
        System.out.println("Digite el precio del prodcuto:");
        precio = sc.nextDouble();
        System.out.println("Digite las existencias del producto:");
        existencias = sc.nextInt();

        factoryProductos.createProducto(sku, nombre, marca, precio, existencias);
    }
}
