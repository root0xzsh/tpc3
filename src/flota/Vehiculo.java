package flota;

public class Vehiculo {

    // Atributos protected para que las subclases los hereden
    protected String patente;
    protected String marca;
    protected double costoBaseKm;

    // Constructor
    public Vehiculo(String patente, String marca, double costoBaseKm) {
        this.patente = patente;
        this.marca = marca;
        this.costoBaseKm = costoBaseKm;
    }

    // Metodo base para calcular costo
    public double calcularCostoViaje(double distanciaKm) {
        return distanciaKm * costoBaseKm;
    }

    // Sobrecarga del metodo
    public double calcularCostoViaje(double distanciaKm, double peajes) {
        return calcularCostoViaje(distanciaKm) + peajes;
    }

    // Metodo mostrar ficha
    public void mostrarFicha() {
        System.out.println("[Vehiculo] Patente: " + patente + " | Marca: " + marca);
    }
}