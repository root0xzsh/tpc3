package flota;

public class Furgoneta extends Vehiculo {

    private boolean tieneRefrigeracion;

    public Furgoneta(String patente, String marca, double costoBaseKm, boolean tieneRefrigeracion) {
        super(patente, marca, costoBaseKm);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        double costo = distanciaKm * costoBaseKm;
        if (tieneRefrigeracion) {
            costo = costo + 5000.0; // Recargo fijo
        }
        return costo;
    }

    @Override
    public void mostrarFicha() {
        String refrigerado = tieneRefrigeracion ? "Si" : "No";
        System.out.println("[Vehiculo] Furgoneta | Patente: " + patente + " | Marca: " + marca + " | Refrigerado: " + refrigerado);
    }
}
