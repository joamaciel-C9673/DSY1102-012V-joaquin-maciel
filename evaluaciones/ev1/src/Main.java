import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Crear gestor
        GestorTallerBicicletas gestor =
                new GestorTallerBicicletas();


        // Crear BIC-E01
        BicicletaElectrica electrica1 =
                new BicicletaElectrica(
                        "BIC-E01",
                        2023,
                        22.5,
                        60,
                        false
                );


        // Crear BIC-E02
        BicicletaElectrica electrica2 =
                new BicicletaElectrica(
                        "BIC-E02",
                        2022,
                        24.0,
                        45,
                        true
                );


        // Crear BIC-M01
        BicicletaMontanya montanya1 =
                new BicicletaMontanya(
                        "BIC-M01",
                        2021,
                        13.5,
                        2
                );


        // Crear BIC-M02
        BicicletaMontanya montanya2 =
                new BicicletaMontanya(
                        "BIC-M02",
                        2020,
                        12.0,
                        1
                );


        // Activar garantia de BIC-E01
        electrica1.activarGarantiaExtendida();


        // Registrar todos los objetos
        gestor.registrar(electrica1);
        gestor.registrar(electrica2);
        gestor.registrar(montanya1);
        gestor.registrar(montanya2);


        // Buscar BIC-E01
        List<Bicicleta> resultados =
                gestor.buscarPorCodigo("BIC-E01");


        // Mostrar resultados de la busqueda
        System.out.println("=== RESULTADO DE BUSQUEDA ===");

        for (Bicicleta bicicleta : resultados) {

            System.out.println(bicicleta);

            System.out.println(
                    "Costo mantencion: "
                            + bicicleta.calcularCostoMantencion()
            );
        }


        // Listar todos
        System.out.println();
        System.out.println("=== TODAS LAS BICICLETAS ===");

        gestor.listarBicicletas();
    }
}