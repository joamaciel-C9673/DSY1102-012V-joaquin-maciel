import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LecturaEntrada lectura =
                new LecturaEntrada(scanner);

        GestorTallerBicicletas gestor =
                new GestorTallerBicicletas();

        BicicletaElectrica electrica1 =
                new BicicletaElectrica(
                        "BIC-E01",
                        2023,
                        22.5,
                        60,
                        false
                );

        BicicletaElectrica electrica2 =
                new BicicletaElectrica(
                        "BIC-E02",
                        2022,
                        24.0,
                        45,
                        true
                );

        BicicletaMontanya montanya1 =
                new BicicletaMontanya(
                        "BIC-M01",
                        2021,
                        13.5,
                        2
                );

        BicicletaMontanya montanya2 =
                new BicicletaMontanya(
                        "BIC-M02",
                        2020,
                        12.0,
                        1
                );

        electrica1.activarGarantiaExtendida();


        gestor.registrar(electrica1);
        gestor.registrar(electrica2);
        gestor.registrar(montanya1);
        gestor.registrar(montanya2);

        System.out.println();
        System.out.println("===== BUSQUEDA INSTITUCIONAL =====");

        List<Bicicleta> resultados =
                gestor.buscarPorCodigo("BIC-E01");

        for (Bicicleta bicicleta : resultados) {
            System.out.println(bicicleta);
            System.out.println("Costo mantencion: " + bicicleta.calcularCostoMantencion());
        }


        System.out.println();
        System.out.println("===== LISTADO INSTITUCIONAL =====");
        gestor.listarBicicletas();

        boolean salir = false;

        while (!salir) {

            mostrarMenu();

            int opcion =
                    lectura.leerEntero(
                            "Seleccione una opcion: "
                    );

            switch (opcion) {

                case 1:
                    gestor.listarBicicletas();
                    break;

                case 2:
                    buscarBicicleta(gestor, lectura);
                    break;

                case 3:
                    simularDescuento(gestor, lectura);
                    break;

                case 4:
                    salir = true;
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println(
                            "Opcion no valida."
                    );
            }
        }

        scanner.close();
    }


    public static void mostrarMenu() {

        System.out.println();
        System.out.println(
                "===== TALLER DE BICICLETAS ====="
        );
        System.out.println(
                "1. Listar todos los objetos"
        );
        System.out.println(
                "2. Buscar por codigo de bicicleta"
        );
        System.out.println(
                "3. Simular costo con descuento"
        );
        System.out.println(
                "4. Salir"
        );
    }


    public static void buscarBicicleta(
            GestorTallerBicicletas gestor,
            LecturaEntrada lectura) {

        String codigo =
                lectura.leerTexto(
                        "Ingrese codigo de bicicleta: "
                );

        List<Bicicleta> resultados =
                gestor.buscarPorCodigo(codigo);

        if (resultados.isEmpty()) {
            System.out.println(
                    "No se encontraron coincidencias."
            );
        } else {
            for (Bicicleta bicicleta : resultados) {
                System.out.println(bicicleta);
                System.out.println(
                        "Costo mantencion: "
                                + bicicleta.calcularCostoMantencion()
                );
            }
        }
    }


    public static void simularDescuento(
            GestorTallerBicicletas gestor,
            LecturaEntrada lectura) {

        String codigo =
                lectura.leerTexto(
                        "Ingrese codigo de bicicleta: "
                );

        List<Bicicleta> resultados =
                gestor.buscarPorCodigo(codigo);

        if (resultados.isEmpty()) {

            System.out.println(
                    "No se encontraron bicicletas con ese codigo."
            );

            return;
        }

        boolean descuentoValido = false;

        while (!descuentoValido) {

            double descuento =
                    lectura.leerDouble(
                            "Ingrese porcentaje de descuento: "
                    );

            try {

                for (Bicicleta bicicleta : resultados) {

                    double costo =
                            bicicleta.calcularCostoMantencion(
                                    descuento
                            );

                    System.out.println(
                            "Codigo: "
                                    + bicicleta.getCodigoBicicleta()
                    );

                    System.out.println(
                            "Costo con descuento: "
                                    + costo
                    );
                }

                descuentoValido = true;

            } catch (IllegalArgumentException e) {

                System.out.println(e.getMessage());
            }
        }
    }
}