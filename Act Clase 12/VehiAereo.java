// Clase Padre de Vehiculos Aereos

public class VehiAereo {
    // Atributos
    protected String modelo;
    protected double velocidad;
    protected boolean vuelo;

    // Constructor
    public VehiAereo(String modelo, double velocidad, boolean vuelo) {
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.vuelo = false; // Inicialmente no está volando
    }

    // Métodos
    public void despegar() {
        velocidad += 50;  // Aumenta la velocidad al despegar
        vuelo = true;  // Cambia el estado a volando
        System.out.println("El vehículo aéreo " + modelo + " está despegando y lleva una velocidad de " + velocidad + " km/h.");
    }
    
    public void mostrarInfo() {
        String estadoVuelo = vuelo ? "volando" : "en tierra"; // Determina el estado de vuelo
        System.out.println("El vehículo aéreo " + modelo + " está " + estadoVuelo + " a una velocidad de " + velocidad + " km/h.");
    }
}