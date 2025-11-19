import java.util.Queue; // Importa la interfaz Queue para definir la cola de solicitudes de pisos
import java.util.LinkedList; // Importa la clase LinkedList para implementar la cola

public class Controlador {
    
    private Queue<Solicitud> direccion; // Cola para almacenar las solicitudes de pisos

    public Controlador() {
        this.direccion = new LinkedList<>(); // Inicializa la cola de solicitudes
    }

    public void agregarSolicitud(Solicitud solicitud) {
        System.out.println("Solicitud pedida desde el piso: " + solicitud.getPiso());
        direccion.add(solicitud); // Agrega la solicitud a la cola
    }

    public Solicitud obtenerSiguienteSolicitud() {
        return direccion.poll(); // Obtiene y elimina la siguiente solicitud de la cola
    }

    public void procesar(Ascensor ascensor) { // void creado para procesar las solicitudes fuera del ascensor en los pisos
        Solicitud Actual;
        while ((Actual = obtenerSiguienteSolicitud()) != null) {
            System.out.println("Procesando solicitud para el piso: " + Actual.toString());
            ascensor.moverAPiso(Actual.getPiso()); // Mueve el ascensor al piso solicitado
        }
        System.out.println("No hay más solicitudes en la cola.");
    }

}
