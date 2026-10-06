public class BicicletaMontanya extends Bicicleta {

    private int cantidadSuspensiones;

    public BicicletaMontanya(String codigoBicicleta,
                             int anioFabricacion,
                             double pesoKg,
                             int cantidadSuspensiones) {

        super(codigoBicicleta, anioFabricacion, pesoKg);

        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    public int getCantidadSuspensiones() {
        return cantidadSuspensiones;
    }

    public void setCantidadSuspensiones(int cantidadSuspensiones) {
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    @Override
    public double calcularCostoMantencion() {

        double costo = 30000;

        if (cantidadSuspensiones > 1) {
            costo = costo * 1.15;
        }

        return costo;
    }

    @Override
    public String toString() {
        return "BicicletaMontanya{" +
                "codigo='" + getCodigoBicicleta() + '\'' +
                ", anio=" + getAnioFabricacion() +
                ", pesoKg=" + getPesoKg() +
                ", cantidadSuspensiones=" + cantidadSuspensiones +
                '}';
    }
}