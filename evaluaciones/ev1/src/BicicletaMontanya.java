public class BicicletaMontanya extends Bicicleta {
    private int cantidadSuspensiones;
    private double costo = 30000;

    public BicicletaMontanya(int cantidadSuspensiones, double costo) {
        this.cantidadSuspensiones = cantidadSuspensiones;
        this.costo = costo;
    }
    if (cantidadSuspensiones > 1){
        costo = costo * 1.15;
    }

    public void setCantidadSuspensiones(int cantidadSuspensiones) {
        this.cantidadSuspensiones = cantidadSuspensiones;
    }


}

