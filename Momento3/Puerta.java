// Controla el estado de la puerta del ascensor y sus interacciones

public class Puerta {
    
    private boolean abierta; // Estado de la puerta
    private Sensor sensor; // Sensor de obstáculos
    private boolean mantenerAbierta; // Modo de mantener la puerta abierta

    public Puerta(Sensor sensor) {
        this.abierta = false; // Inicialmente la puerta está cerrada
        this.sensor = sensor;
        this.mantenerAbierta = false; // Inicialmente no está en modo mantener abierta
    }

    public boolean isAbierta() {
        return abierta;
    }

    public boolean isMantenerAbierta() {
        return mantenerAbierta;
    }

    public void setMantenerAbierta(boolean mantenerAbierta) {
        this.mantenerAbierta = mantenerAbierta;
        System.out.println("Modo mantener puerta abierta: " + mantenerAbierta); 
        // Mensaje indicando el estado del modo mantener puerta abierta
    }

    public void abrir() { // Abre la puerta del ascensor
        if (!abierta) {
            abierta = true;
            System.out.println("La puerta se ha abierto.");
        } else {
            System.out.println("La puerta ya está abierta.");
        }
    }

    public void cerrar() {
        if (abierta) {
            if (sensor.isObstaculoDetec()) { // Verifica si hay un obstáculo detectado
                System.out.println("No se puede cerrar la puerta, hay un obstáculo.");
            } else if (mantenerAbierta) { // Verifica si está en modo mantener abierta
                System.out.println("La puerta se mantiene abierta debido al modo mantener abierta.");
            } else { // Cierra la puerta si no hay obstáculos y no está en modo mantener abierta
                abierta = false;
                System.out.println("La puerta se ha cerrado.");
            }
        } else { // Si la puerta ya está cerrada notifica al usuario
            System.out.println("La puerta ya está cerrada.");
        }
    }
}
