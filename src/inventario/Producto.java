package inventario;

public class Producto {

    // Atributos publicos
    public String nombre;
    public String codigo;
    public double precio;
    public int stock;

    // Metodo para vender
    public void venderUnidades(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock = stock - cantidad;
            System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre + ". Stock restante: " + stock);
        } else {
            if (cantidad <= 0) {
                System.out.println("Error: la cantidad a vender debe ser mayor a cero.");
            } else {
                System.out.println("Error: stock insuficiente para vender " + cantidad + " unidades de " + nombre + ".");
            }
        }
    }

    // Metodo para reponer
    public void reponerStock(int cantidad) {
        if (cantidad > 0) {
            stock = stock + cantidad;
            System.out.println("Reposicion registrada: +" + cantidad + " unidades. Stock actual: " + stock);
        } else {
            System.out.println("Error: la cantidad a reponer debe ser mayor a cero.");
        }
    }

    // Metodo para actualizar precio (usando this para resolver el sombreamiento)
    public void actualizarPrecio(double precio) {
        double precioAnterior = this.precio;
        this.precio = precio;
        System.out.println("Precio actualizado de " + this.nombre + ": $" + precioAnterior + " -> $" + this.precio);
    }

    // Metodo para mostrar la ficha
    public void mostrarFicha() {
        System.out.println("=== Ficha de producto ===");
        System.out.println("Codigo:  " + codigo);
        System.out.println("Nombre:  " + nombre);
        System.out.println("Precio:  $" + precio);
        System.out.println("Stock:   " + stock);
        System.out.println("==========================");
    }

    // Desafio de extension: aplicar descuento
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            double descuento = precio * (porcentaje / 100);
            precio = precio - descuento;
            System.out.println("Descuento del " + porcentaje + "% aplicado a " + nombre + ". Nuevo precio: $" + precio);
        } else {
            System.out.println("Error: el porcentaje de descuento debe estar entre 0 y 100.");
        }
    }
}