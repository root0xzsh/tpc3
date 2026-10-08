package flota;

public class MainFlota {
    public static void main(String[] args) {

        Vehiculo[] flota = new Vehiculo[3];

        flota[0] = new Camion("AA123BB", "Scania", 450.88, 18.0);
        flota[1] = new Furgoneta("AF456CD", "Mercedes-Benz", 416.66, true);
        flota[2] = new MotoEnvios("A099XYZ", "Honda", 180.0);

        double costoTotal = 0.0;
        double distanciaRecorrida = 150.0;

        System.out.println("=== Reporte de Operaciones de Flota ===");

        for (Vehiculo v : flota) {
            v.mostrarFicha();
            double costoViaje = v.calcularCostoViaje(distanciaRecorrida);
            System.out.println("Costo de viaje (" + distanciaRecorrida + " km): $" + costoViaje);
            System.out.println("----------------------------------------");
            costoTotal = costoTotal + costoViaje;
        }

        System.out.println("Costo total operativo de la flota: $" + costoTotal);
    }
}