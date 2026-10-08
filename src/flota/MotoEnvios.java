package flota;

public class MotoEnvios extends Vehiculo {

    public MotoEnvios(String patente, String marca, double costoBaseKm) {
        super(patente, marca, costoBaseKm);
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        // Aplica un descuento del 15% (paga el 85%)
        return (distanciaKm * costoBaseKm) * 0.85;
    }

    @Override
    public void mostrarFicha() {
        System.out.println("[Vehiculo] MotoEnvios | Patente: " + patente + " | Marca: " + marca + " | Mensajeria liviana");
    }
}
