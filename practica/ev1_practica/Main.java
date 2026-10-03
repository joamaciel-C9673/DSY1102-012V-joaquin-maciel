import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- REGISTRO DE ENTRADA ---");

        System.out.print("Ingrese código: ");
        String codigo = scanner.nextLine();

        System.out.print("Ingrese nombre del evento: ");
        String nombreEvento = scanner.nextLine();

        double precioBase;

        do {
            System.out.print("Ingrese precio base: ");
            precioBase = scanner.nextDouble();

            if (precioBase <= 0) {
                System.out.println("El precio debe ser mayor que cero.");
            }

        } while (precioBase <= 0);

        Entrada entrada = new Entrada(codigo, nombreEvento, precioBase);

        int opcion;

        do {

            System.out.println("\n--- EVENTPASS ---");
            System.out.println("1. Mostrar información");
            System.out.println("2. Calcular precio normal");
            System.out.println("3. Calcular precio con descuento");
            System.out.println("4. Vender entrada");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\nCódigo: " + entrada.getCodigo());
                    System.out.println("Evento: " + entrada.getNombreEvento());
                    System.out.println("Precio base: " + entrada.getPrecioBase());
                    System.out.println("Disponible: " + entrada.isDisponible());
                    break;

                case 2:
                    System.out.println(
                            "Precio final: " + entrada.calcularPrecioFinal()
                    );
                    break;

                case 3:
                    double descuento;

                    do {
                        System.out.print("Ingrese descuento (0-100): ");
                        descuento = scanner.nextDouble();

                        if (descuento < 0 || descuento > 100) {
                            System.out.println(
                                    "El descuento debe estar entre 0 y 100."
                            );
                        }

                    } while (descuento < 0 || descuento > 100);

                    System.out.println(
                            "Precio con descuento: "
                                    + entrada.calcularPrecioFinal(descuento)
                    );
                    break;

                case 4:
                    if (entrada.vender()) {
                        System.out.println("Entrada vendida correctamente.");
                    } else {
                        System.out.println(
                                "Venta rechazada: la entrada no está disponible."
                        );
                    }
                    break;

                case 0:
                    System.out.println("Saliendo de EventPass...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}