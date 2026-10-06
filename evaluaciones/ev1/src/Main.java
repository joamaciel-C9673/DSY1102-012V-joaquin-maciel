public class Main {

    public static void main(String[] args) {

        BicicletaElectrica electrica = new BicicletaElectrica(
                "BE01",
                2025,
                20,
                80,
                true
        );

        System.out.println("Garantia inicial:");
        System.out.println(electrica.tieneGarantiaExtendidaActiva());

        electrica.activarGarantiaExtendida();

        System.out.println("Garantia despues de activar:");
        System.out.println(electrica.tieneGarantiaExtendidaActiva());
    }
}