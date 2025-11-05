public class Conductor {
     private int cedula;
    private String nombre;

    public Conductor(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;

    }

    public String toString() {
        return "Conductor { Cedula: " + cedula + " Nombre: " + nombre + " }";
    }
}

