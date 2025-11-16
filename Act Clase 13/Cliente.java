public class Cliente {
    
    private int cedula;
    private String nombre;
    private double direccion;
    private int telefono;
    
    
    
    public Cliente(int cedula, String nombre, double direccion, int telefono){
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
     
    public void print(){
        System.out.println("----- Cliente -----");
        System.out.println("Cédula: " + cedula + ", Nombre: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono);
    }
}
