public class Main {

    public static void main(String[] args) {

        GestorTallerBicicletas gestor =
                new GestorTallerBicicletas();

        Bicicleta electrica = new BicicletaElectrica(
                "BE01",
                2025,
                20,
                80,
                false
        );

        Bicicleta montanya = new BicicletaMontanya(
                "BM01",
                2025,
                15,
                2
        );

        gestor.registrar(electrica);
        gestor.registrar(montanya);

        gestor.listarBicicletas();

        gestor.listarCostosMantencion();
    }
}