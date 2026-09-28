package biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {

        System.out.println("--- Prueba de constructor con datos invalidos ---");
        // Creo un libro con titulo vacio para probar la validacion
        Libro libroInvalido = new Libro("", "Autor Valido", "123456789", 2, 20000.0);
        System.out.println("Titulo del libro invalido: " + libroInvalido.getTitulo());
        System.out.println();

        System.out.println("--- Prueba de setter con precio invalido ---");
        Libro libroPruebaSetter = new Libro("Libro de Prueba", "Autor Prueba", "987654321");
        double precioAnterior = libroPruebaSetter.getPrecioReposicion();
        boolean aceptado = libroPruebaSetter.setPrecioReposicion(-100.0);
        System.out.println("Se acepto el precio -100.0? " + aceptado + " (se mantiene el precio anterior)");
        System.out.println("Precio actual: " + libroPruebaSetter.getPrecioReposicion());
        System.out.println();

        // Creacion de los 3 libros
        Libro libro1 = new Libro("Clean Code", "Robert C. Martin", "9780132350884");
        Libro libro2 = new Libro("Efectivo con Java", "Ana Restrepo", "9781234567897", 3, 22000.0);
        Libro libro3 = new Libro("Cien Anos de Soledad", "Gabriel Garcia Marquez", "9780307474728", 2, 18500.0);

        // new Libro(); // No compila porque al declarar constructores propios, el constructor por defecto que regalaba el compilador dejo de existir.

        System.out.println();

        System.out.println("--- Prueba de prestamos y agotamiento ---");
        libro1.prestar();
        libro1.prestar();
        libro1.devolver();

        System.out.println();

        System.out.println("--- Prueba de actualizacion de precio ---");
        double precioViejo = libro1.getPrecioReposicion();
        libro1.setPrecioReposicion(18000.0);
        System.out.println("Precio de reposicion actualizado de \"" + libro1.getTitulo() + "\": $" + precioViejo + " -> $" + libro1.getPrecioReposicion());

        System.out.println();

        // Muestro las fichas de cada libro
        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();

        System.out.println("Prestamos historicos totales de \"" + libro1.getTitulo() + "\": " + libro1.getPrestamosHistoricos());
    }
}