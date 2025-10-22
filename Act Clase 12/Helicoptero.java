public class Helicoptero extends VehiAereo {

    private int numHelices; // Número de hélices

    public Helicoptero(String modelo, double velocidad, int numHelices) {
        super(modelo, velocidad, false); // Llama al constructor de la clase padre
        this.numHelices = numHelices;
    }

    @Override
    public void despegar() {
        super.despegar(); // Llama al método despegar de la clase padre
        System.out.println("El helicóptero con " + numHelices + " hélices ha despegado.");
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método mostrarInfo de la clase padre
        System.out.println("El helicóptero tiene " + numHelices + " hélices.");
        System.out.println("Velocidad actual: " + velocidad + " km/h.");
    }
}
