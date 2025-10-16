package Tienda;

public class Principal {
    public static void main(String[] args) {
        Producto producto1 = new Producto("", "", -5, -100.0);
        Producto producto2 = new Producto("A123", "Laptop", 10, 1500.0);
        Producto producto3 = new Producto("B456", "Smartphone", 20, 800.0);

        System.out.println("\nDetalles de los productos:\n");
        System.out.println("\nProducto 1: " + producto1.getDescripcion() + ", Precio Unitario: $" + producto1.getPrecioUnitario());
        System.out.println("\nProducto 2: " + producto2.getDescripcion() + ", Precio Unitario: $" + producto2.getPrecioUnitario());
        System.out.println("\nProducto 3: " + producto3.getDescripcion() + ", Precio Unitario: $" + producto3.getPrecioUnitario());

        System.out.println("\nAplicando descuentos e incrementando cantidades...\n");
        producto1.aplicarDescuento(20); // No aplica descuento, porcentaje inválido
        System.out.println("Producto 1 después del descuento: $" + producto1.getPrecioUnitario());

        producto2.aplicarDescuento(10); // Aplica un descuento del 10%
        System.out.println("Producto 2 después del descuento: $" + producto2.getPrecioUnitario());

        producto3.incrementarCantidad(5); // Incrementa la cantidad en 5
        System.out.println("Producto 3 cantidad después de incrementar: " + producto3.getCantidad());

        System.out.println("\nCalculando precios totales...\n");
        System.out.println("Precio total de Producto 1: $" + producto1.calcularPrecioTotal());
        System.out.println("Precio total de Producto 2: $" + producto2.calcularPrecioTotal());
        System.out.println("Precio total de Producto 3: $" + producto3.calcularPrecioTotal());
    }
}
