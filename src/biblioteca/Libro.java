package biblioteca;

public class Libro {

    // Atributos privados
    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;

    // Desafio de extension
    private int prestamosHistoricos;

    // Constructor canonico
    public Libro(String titulo, String autor, String isbn, int copiasDisponibles, double precioReposicion) {
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Titulo invalido, se uso \"Sin titulo\" por defecto.");
            this.titulo = "Sin titulo";
        } else {
            this.titulo = titulo;
        }

        if (autor == null || autor.trim().isEmpty()) {
            System.out.println("Autor invalido, se uso \"Autor desconocido\" por defecto.");
            this.autor = "Autor desconocido";
        } else {
            this.autor = autor;
        }

        if (isbn == null || isbn.trim().isEmpty()) {
            System.out.println("ISBN invalido, se uso \"ISBN pendiente\" por defecto.");
            this.isbn = "ISBN pendiente";
        } else {
            this.isbn = isbn;
        }

        if (copiasDisponibles < 0) {
            System.out.println("Copias disponibles no puede ser negativo. Se asigno 0 por defecto.");
            this.copiasDisponibles = 0;
        } else {
            this.copiasDisponibles = copiasDisponibles;
        }

        // Reutilizo el setter para no repetir la logica de validacion
        if (!setPrecioReposicion(precioReposicion)) {
            System.out.println("Precio de reposicion invalido. Se uso $15000.0 por defecto.");
            this.precioReposicion = 15000.0;
        }

        this.prestamosHistoricos = 0;
    }

    // Constructor de conveniencia
    public Libro(String titulo, String autor, String isbn) {
        this(titulo, autor, isbn, 1, 15000.0);
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public double getPrecioReposicion() {
        return precioReposicion;
    }

    public int getPrestamosHistoricos() {
        return prestamosHistoricos;
    }

    // Setter validado
    public boolean setPrecioReposicion(double precio) {
        if (precio > 0) {
            this.precioReposicion = precio;
            return true;
        } else {
            return false;
        }
    }

    // Operaciones de dominio
    public boolean prestar() {
        prestamosHistoricos++;

        if (copiasDisponibles > 0) {
            copiasDisponibles--;
            System.out.println("Prestamo registrado: \"" + titulo + "\". Copias disponibles: " + copiasDisponibles);
            return true;
        } else {
            System.out.println("Error: no hay copias disponibles de \"" + titulo + "\" para prestar.");
            return false;
        }
    }

    public void devolver() {
        copiasDisponibles++;
        System.out.println("Devolucion registrada: \"" + titulo + "\". Copias disponibles: " + copiasDisponibles);
    }

    public void mostrarFicha() {
        System.out.println("=== Ficha de libro ===");
        System.out.println("Titulo:  " + titulo);
        System.out.println("Autor:   " + autor);
        System.out.println("ISBN:    " + isbn);
        System.out.println("Copias disponibles: " + copiasDisponibles);
        System.out.println("Precio de reposicion: $" + precioReposicion);
        System.out.println("=======================");
    }
}
