public abstract class Bicicleta {

    private String codigoBicicleta;
    private int anioFabricacion;
    private double pesoKg;

    public Bicicleta(String codigoBicicleta, int anioFabricacion, double pesoKg) {
        this.codigoBicicleta = codigoBicicleta;
        this.anioFabricacion = anioFabricacion;
        this.pesoKg = pesoKg;
    }

    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setCodigoBicicleta(String codigoBicicleta) {
        if (codigoBicicleta != null && !codigoBicicleta.isEmpty()) {
            this.codigoBicicleta = codigoBicicleta;
        } else {
            throw new IllegalArgumentException(
                    "El codigo de bicicleta no puede ser nulo o vacio"
            );
        }
    }

    public void setAnioFabricacion(int anioFabricacion) {
        if (anioFabricacion > 2000 && anioFabricacion < 2026) {
            this.anioFabricacion = anioFabricacion;
        } else {
            throw new IllegalArgumentException(
                    "El año de fabricacion de la bicicleta no puede ser menor a 2000 o mayor a 2026"
            );
        }
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg > 0) {
            this.pesoKg = pesoKg;
        } else {
            throw new IllegalArgumentException(
                    "El peso de kg no puede ser menor o igual a 0"
            );
        }
    }

    public abstract double calcularCostoMantencion();

    public double calcularCostoMantencion(double porcentajeDescuento) {
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException(
                    "El descuento debe estar entre 0 y 100"
            );
        }

        double costoNormal = calcularCostoMantencion();
        return costoNormal - (costoNormal * porcentajeDescuento / 100);
    }
}