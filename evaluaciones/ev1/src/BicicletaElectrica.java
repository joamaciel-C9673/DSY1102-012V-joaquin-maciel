public class BicicletaElectrica extends Bicicleta
        implements ConGarantiaExtendida {

    private double autonomiaKm;
    private boolean bateriaCertificada;
    private boolean garantiaExtendidaActiva = false;

    public BicicletaElectrica(String codigoBicicleta,
                              int anioFabricacion,
                              double pesoKg,
                              double autonomiaKm,
                              boolean bateriaCertificada) {

        super(codigoBicicleta, anioFabricacion, pesoKg);

        this.autonomiaKm = autonomiaKm;
        this.bateriaCertificada = bateriaCertificada;
    }

    public double getAutonomiaKm() {
        return autonomiaKm;
    }

    public void setAutonomiaKm(double autonomiaKm) {
        this.autonomiaKm = autonomiaKm;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    public boolean isGarantiaExtendidaActiva() {
        return garantiaExtendidaActiva;
    }

    public void setGarantiaExtendidaActiva(boolean garantiaExtendidaActiva) {
        this.garantiaExtendidaActiva = garantiaExtendidaActiva;
    }

    @Override
    public double calcularCostoMantencion() {

        double costo = 45000;

        if (!bateriaCertificada) {
            costo = costo * 1.25;
        }

        return costo;
    }

    @Override
    public boolean tieneGarantiaExtendidaActiva() {
        return garantiaExtendidaActiva;
    }

    @Override
    public void activarGarantiaExtendida() {
        garantiaExtendidaActiva = true;
    }

    @Override
    public String toString() {
        return "BicicletaElectrica{" +
                "codigo='" + getCodigoBicicleta() + '\'' +
                ", anio=" + getAnioFabricacion() +
                ", pesoKg=" + getPesoKg() +
                ", autonomiaKm=" + autonomiaKm +
                ", bateriaCertificada=" + bateriaCertificada +
                '}';
    }
}