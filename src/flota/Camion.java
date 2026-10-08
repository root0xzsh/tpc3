package flota;

public class Camion extends Vehiculo {

    private double capacidadToneladas;

    public Camion(String patente, String marca, double costoBaseKm, double capacidadToneladas) {
        super(patente, marca, costoBaseKm);
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        // Agrega un 5% extra por cada tonelada
        double costoBase = distanciaKm * costoBaseKm;
        return costoBase * (1 + capacidadToneladas * 0.05);
    }

    @Override
    public void mostrarFicha() {
        System.out.println("[Vehiculo] Camion | Patente: " + patente + " | Marca: " + marca + " | Toneladas: " + capacidadToneladas);
    }
}