import java.util.Scanner;

public class LecturaEntrada {

    private Scanner scanner;

    public LecturaEntrada(Scanner scanner) {
        this.scanner = scanner;
    }

    public int leerEntero(String mensaje) {

        while (true) {

            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            try {
                return Integer.parseInt(entrada);

            } catch (NumberFormatException e) {

                System.out.println("Error: debe ingresar un numero.");
            }
        }
    }

    public double leerDouble(String mensaje) {

        while (true) {

            System.out.print(mensaje);
            String entrada = scanner.nextLine();

            try {
                return Double.parseDouble(entrada);

            } catch (NumberFormatException e) {

                System.out.println("Error: debe ingresar un numero.");
            }
        }
    }

    public String leerTexto(String mensaje) {

        System.out.print(mensaje);
        return scanner.nextLine();
    }
}