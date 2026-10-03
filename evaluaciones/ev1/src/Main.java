public class Main {
    public static void main(String[] args) {

        Bicicleta bicicleta = new Bicicleta("320b",24,123);
        bicicleta.setCodigoBicicleta("032B");

        bicicleta.setAnioFabricacion(2015);

        bicicleta.setPesoKg(15);

        System.out.println(bicicleta.getCodigoBicicleta());
        System.out.println(bicicleta.getAnioFabricacion());
        System.out.println(bicicleta.getPesoKg());
    }
}
/**
 * gracias a desarrolarlo de esta manera en relacion a objetos permite identificar mucho mas facil donde puede quedar el
 * error en el codigo o que parte esta muy sobrecargada
 */