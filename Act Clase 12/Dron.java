public class Dron extends VehiAereo {

    private double bateria; // Nivel de batería en porcentaje

    public Dron(String modelo, double velocidad, double bateria) {
        super(modelo, velocidad, false); // Llama al constructor de la clase padre
        this.bateria = bateria;
    }

    @Override
    public void despegar() {
        if (bateria >= 20) { // Verifica si hay suficiente batería para despe
            super.despegar(); // Llama al método despegar de la clase padre
            System.out.println("El dron ha despegado con un nivel de batería del " + bateria + "%.");
        } else {
            System.out.println("No hay suficiente batería para despegar. Nivel de batería: " + bateria + "%.");
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método mostrarInfo de la clase padre
        System.out.println("El dron tiene un nivel de batería del " + bateria + "%.");
        System.out.println("El dron volo con una velocidad de " + velocidad + " km/h.");
    }
}
