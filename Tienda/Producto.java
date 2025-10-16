package Tienda;

public class Producto {

    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public Producto(String codigo, String descripcion, int cantidad, double precioUnitario){
        if (codigo != null && !codigo.isEmpty()){
            this.codigo = codigo;
        } else {
            this.codigo = "0000";
        }
        if (descripcion != null && !descripcion.isEmpty()){
            this.descripcion = descripcion;
        } else {
            this.descripcion = "Sin descripción";
        }
        if (cantidad >= 0){
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
        if (precioUnitario >= 0){
            this.precioUnitario = precioUnitario;
        } else {
            this.precioUnitario = 0.0;
        }
    }

    public String getCodigo() {
        return codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double calcularPrecioTotal() {
        return cantidad * precioUnitario;
    }
    //descuento aplica si 0 porcentaje 50
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 50) {
            double descuento = (porcentaje / 100) * precioUnitario;
            precioUnitario -= descuento;
        }
    }
    public void incrementarCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }
@Override
    public String toString(){
        return "Código: " + codigo + 
        "\nDescripción: " + descripcion + 
        "\nCantidad: " + cantidad + 
        "\nPrecio Unitario: $" + precioUnitario +
        "\nPrecio Total: $" + calcularPrecioTotal();
    }
}