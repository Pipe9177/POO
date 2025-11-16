import java.util.Date;

public class Pedido {
    private Cliente cliente;
    private Producto producto;
    private Date fecha;
    private int cantidad;
    private double total;
    private String estado;

    public Pedido(Cliente cliente, Producto producto, Date fecha, int cantidad, String estado){
        this.cliente = cliente;
        this.producto = producto;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.total = producto.getPrecio() * cantidad;
        this.estado = estado;
        calcularTotal();
    }

    private void calcularTotal(){
        if (total > 1){
            if (cantidad > 10) {
                total = total * 0.9; // Aplicar 10% de descuento
            } else {
                total = total; // Sin descuento
                }
        } else {
            System.out.println("Cantidad inválida");
        } 
} 


    public void print(){
        System.out.println("----- Pedido -----");
        producto.print();
        System.out.println("Fecha: " + fecha + ", Cantidad: " + cantidad + ", Total: " + total + ", Estado: " + estado);
    }
}
