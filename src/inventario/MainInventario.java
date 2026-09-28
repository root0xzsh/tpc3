package inventario;

public class MainInventario {
    public static void main(String[] args) {

        // Creacion de los 3 objetos
        Producto productoUno = new Producto();
        productoUno.nombre = "Teclado mecanico";
        productoUno.codigo = "P-001";
        productoUno.precio = 45000.0;
        productoUno.stock = 12;

        Producto productoDos = new Producto();
        productoDos.nombre = "Mouse inalambrico";
        productoDos.codigo = "P-002";
        productoDos.precio = 25000.0;
        productoDos.stock = 5;

        Producto productoTres = new Producto();
        productoTres.nombre = "Monitor 24 pulgadas";
        productoTres.codigo = "P-003";
        productoTres.precio = 180000.0;
        productoTres.stock = 3;

        // Mostramos la ficha del primer producto antes de modificarlo
        productoUno.mostrarFicha();

        // Ejercitamos los metodos del productoUno (como en la salida esperada)
        productoUno.venderUnidades(3); // Venta exitosa
        productoUno.venderUnidades(50); // Error por stock insuficiente
        productoUno.reponerStock(20); // Reposicion exitosa
        productoUno.actualizarPrecio(39900.0); // Actualizacion de precio

        System.out.println();

        // Verificamos que los otros objetos NO se modificaron
        System.out.println("--- Verificacion de independencia de objetos ---");
        productoDos.mostrarFicha();
        productoTres.mostrarFicha();

        System.out.println();

        // Demostracion de aliasing (copiar referencia)
        System.out.println("--- Prueba de aliasing ---");
        Producto copia = productoUno;
        copia.stock = 29;

        // Mostramos que productoUno.stock tambien cambio
        System.out.println("Stock de productoUno tras modificar copia: " + productoUno.stock + " (mismo objeto en el Heap)");

        System.out.println();

        // Desafio de extension: aplicar descuento
        System.out.println("--- Prueba de descuento ---");
        productoUno.aplicarDescuento(10.0); // 10% de descuento
        productoUno.aplicarDescuento(150.0); // Error, fuera de rango
    }
}