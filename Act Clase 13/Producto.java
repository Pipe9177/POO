public class Producto {

    private int numero;
    private String nombre;
    private double precio;
    private String disponible;

    public Producto(int numero, String nombre, double precio, String disponible) {
        this.numero = numero;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    public int getnumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDisponible() {
        return disponible;
    }

    public void print() {
        System.out.println("----Producto: " + nombre + "-----\n");
        System.out.println("----Número: " + numero + ", precio: " + precio + " pesos, disponible: " + disponible + "-----\n");
    }
}
