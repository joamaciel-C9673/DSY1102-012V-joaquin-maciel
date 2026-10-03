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
