import java.util.ArrayList;
import java.util.List;

public class GestorTallerBicicletas {

    private List<Bicicleta> bicicletas;

    public GestorTallerBicicletas() {
        bicicletas = new ArrayList<>();
    }

    public void registrar(Bicicleta bicicleta) {

        bicicletas.add(bicicleta);

        System.out.println("Bicicleta registrada correctamente.");
    }

    public List<Bicicleta> buscarPorCodigo(String criterio) {

        List<Bicicleta> resultados = new ArrayList<>();

        for (Bicicleta bicicleta : bicicletas) {

            if (bicicleta.getCodigoBicicleta().equals(criterio)) {
                resultados.add(bicicleta);
            }
        }

        return resultados;
    }

    public void listarBicicletas() {

        for (Bicicleta bicicleta : bicicletas) {
            System.out.println(bicicleta);
        }
    }

    public void listarCostosMantencion() {

        for (Bicicleta bicicleta : bicicletas) {

            System.out.println(
                    "Codigo: " + bicicleta.getCodigoBicicleta()
            );

            System.out.println(
                    "Costo mantencion: "
                            + bicicleta.calcularCostoMantencion()
            );
        }
    }
}