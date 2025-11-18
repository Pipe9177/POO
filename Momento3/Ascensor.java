import java.util.LinkedList; // Importa la clase LinkedList para usarla como cola de solicitudes
import java.util.Queue; // Importa la interfaz Queue para definir la cola de solicitudes de pisos

public class Ascensor {

    private int pisoActual;
    private Puerta puerta;
    private static final int PISO_MINIMO = 0; // Definición del piso mínimo
    private static final int PISO_MAXIMO = 10; // Definición del piso máximo
    private Queue<Solicitud> cola; // Cola para almacenar las solicitudes de pisos
    private boolean emergencia; // Estado de emergencia del ascensor

    public Ascensor(Puerta puerta) {

        this.puerta = puerta;
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

    public void registrarSolicituddesdePiso(BotonPiso botonPiso) {
        int bp = botonPiso.getNumero();
        cola.add(new Solicitud(bp, true)); // Agrega la solicitud a la cola
        System.out.println("Solicitud registrada para el piso " + bp);
        mover();
    }

    public void registrarSolicitud(int piso) {
        if (piso < PISO_MINIMO || piso > PISO_MAXIMO) { // Verifica si el piso es válido con el operador OR
            System.out.println("Piso inválido: " + piso);
            return;
        } else {
        cola.add(new Solicitud(piso, false)); // Agrega la solicitud a la cola
        System.out.println("Solicitud registrada para el piso " + piso);
        mover();
        }
    }

    
    public void motor(){ // Método para controlar el movimiento del ascensor
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

    public void agregarSolicitudDesdePisoSb(BotonAscen botonAscen) {
        int Sb = botonAscen.getNumero();
       cola.add(new Solicitud(Sb, true));
        mover();
    }

     public void agregarSolicitudDesdePisoDs(BotonPiso botonPiso) {
        int bp = botonPiso.getNumero();
       cola.add(new Solicitud(bp, true));
        mover();
    }

        public void mover() {
                         if (cola.isEmpty()) {
                            Solicitud Sb = cola.peek(); // Obtiene la siguiente solicitud sin eliminarla
                            int pisoSb = Sb.getPiso(); // Obtiene el piso destino de la solicitud
                            while (pisoActual != pisoSb) {
                             if (pisoActual < pisoSb) {
                        pisoActual++;
                    } else if (pisoActual > pisoSb) {
                        pisoActual--;
                    }
                    System.out.println("Ascensor en el piso: " + pisoActual); 
                    if (pisoActual == pisoSb) {
                        System.out.println("Ascensor ha llegado al piso: " + pisoSb);
                        puerta.abrir(); // Abre la puerta al llegar al piso
                        cola.poll(); // Elimina la solicitud procesada de la cola 
                    }
                    try {
                        Thread.sleep(1000); // Simula el tiempo de movimiento entre pisos
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } if (cola.isEmpty()) {
                            Solicitud bp = cola.peek(); // Obtiene la siguiente solicitud sin eliminarla
                            int pisoBp = bp.getPiso(); // Obtiene el piso destino de la solicitud
                            while (pisoActual != pisoBp) {
                             if (pisoActual < pisoBp) {
                        pisoActual++;
                    } else if (pisoActual > pisoBp) {
                        pisoActual--;
                    }
                    System.out.println("Ascensor en el piso: " + pisoActual); 
                    if (pisoActual == pisoBp) {
                        System.out.println("Ascensor ha llegado al piso: " + pisoBp);
                        puerta.abrir(); // Abre la puerta al llegar al piso
                        cola.poll(); // Elimina la solicitud procesada de la cola 
                    }
                    try {
                        Thread.sleep(1000); // Simula el tiempo de movimiento entre pisos
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                            } else{
                            Solicitud objetivo = cola.peek(); // Obtiene la siguiente solicitud sin eliminarla
                                int pisoDestino = objetivo.getPiso(); // Obtiene el piso destino de la solicitud
                            while (pisoActual != pisoDestino) {
                             if (pisoActual < pisoDestino) {
                        pisoActual++;
                    } else if (pisoActual > pisoDestino) {
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
}

            
        




    public Puerta getPuerta() {
        return puerta;
    }
}
