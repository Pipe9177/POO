import java.util.LinkedList; // Importa la clase LinkedList para usarla como cola de solicitudes
import java.util.Queue; // Importa la interfaz Queue para definir la cola de solicitudes de pisos
import java.util.ResourceBundle.Control;

public class Ascensor {

    private int pisoActual;
    private Puerta puerta;
    private static final int PISO_MINIMO = 0; // Definición del piso mínimo
    private static final int PISO_MAXIMO = 10; // Definición del piso máximo
    private Queue<Solicitud> cola; // Cola para almacenar las solicitudes de pisos
    private boolean emergencia; // Estado de emergencia del ascensor
    private Controlador controlador;

    public Ascensor(Controlador controlador) {
        this.pisoActual = 0; // Inicializa el ascensor en el piso 0
        this.controlador = controlador;
        this.cola = new LinkedList<>(); // Inicializa la cola de solicitudes
        this.emergencia = false; // Inicialmente no está en estado de emergencia
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void activarEmergencia() {
        this.emergencia = true; // Activa el estado de emergencia
        System.out.println("Emergencia activada. El ascensor se detendrá.");
    }

    public void moverAPiso(int piso) {
        System.out.println("\n Ascensor dirigiendose al piso: " + piso);
        if (piso > pisoActual) {
            while (pisoActual < piso) {
                pisoActual++;
                System.out.println("Ascensor en el piso: " + pisoActual);
                try {
                    Thread.sleep(1000); // Simula el tiempo de movimiento entre pisos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else if (piso < pisoActual) {
            while (pisoActual > piso) {
                pisoActual--;
                System.out.println("Ascensor en el piso: " + pisoActual);
                try {
                    Thread.sleep(1000); // Simula el tiempo de movimiento entre pisos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("El ascensor ya está en el piso " + piso);

        }
        mover();
    }

    public void mostrarEstado() {
        System.out.println("Piso actual: " + pisoActual);
        System.out.println("Estado de la puerta: " + (puerta.isAbierta() ? "Abierta" : "Cerrada"));
        System.out.println("Estado de emergencia: " + (emergencia ? "Activada" : "Desactivada"));
    }

    public void motor() { // Método para controlar el movimiento del ascensor
        if (emergencia) {
            System.out.println("El ascensor está en estado de emergencia y no puede moverse.");
            return;
        }
        if (puerta.isAbierta()) {
            System.out.println("La puerta está abierta. Cerrando la puerta antes de moverse.");
            puerta.cerrar(); // Cierra la puerta antes de moverse
            return;
        }
    }

    public void mover() {
        if (cola.isEmpty()) {
        } else {
            Solicitud objetivo = cola.peek(); // Obtiene la siguiente solicitud sin eliminarla
            int pisoDestino = objetivo.getPiso(); // Obtiene el piso destino de la solicitud
            while (pisoActual != pisoDestino) {
                if (pisoActual < pisoDestino) {
                    pisoActual++;
                    System.out.println("Ascendiendo...");
                } else if (pisoActual > pisoDestino) {
                    System.out.println("Descendiendo...");
                    pisoActual--;
                }
                System.out.println("Ascensor en el piso: " + pisoActual);
                if (pisoActual == pisoDestino) {
                    System.out.println("Ascensor ha llegado al piso: " + pisoDestino);
                    puerta.abrir(); // Abre la puerta al llegar al piso
                    cola.poll(); // Elimina la solicitud procesada de la cola
                }
                try {
                    Thread.sleep(1000); // Simula el tiempo de movimiento entre pisos
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void iniciarInterfaz() {
        System.out.println("Interfaz de ascensor iniciada.");
    }

}
