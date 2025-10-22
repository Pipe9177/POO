public class Avion extends VehiAereo {

    private int capPasajeros; // Capacidad de pasajeros

    public Avion(String modelo, double velocidad, int capPasajeros) {
        super(modelo, velocidad, false); // Llama al constructor de la clase padre
        this.capPasajeros = capPasajeros;
    }

    @Override
    public void despegar() {
        super.despegar(); // Llama al método despegar de la clase padre
        System.out.println("El avión con capacidad para " + capPasajeros + " pasajeros ha despegado.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método mostrarInfo de la clase padre
        System.out.println("El avión tiene una capacidad para " + capPasajeros + " pasajeros.");
        System.out.println("Velocidad actual: " + velocidad + " km/h.");
    }
}
       