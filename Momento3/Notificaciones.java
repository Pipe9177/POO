public class Notificaciones {
    
    public void notificarPuertaAbierta(int piso) { // Notifica que la puerta está abierta en un piso específico
        System.out.println("Notificación: La puerta del ascensor está abierta en el piso " + piso + ".");
    }

    public void notificarPuertaCerrada(int piso) { // Notifica que la puerta está cerrada en un piso específico
        System.out.println("Notificación: La puerta del ascensor está cerrada en el piso " + piso + ".");
    }

    public void notificarMovimientoAscensor(int pisoActual, int pisoDestino) { 
        // Notifica que el ascensor se está moviendo entre dos pisos
        System.out.println("Notificación: El ascensor se está moviendo del piso " + pisoActual + " al piso " + pisoDestino + ".");
    }

    public void notificarObstaculoDetectado(int piso) { 
        // Notifica que se ha detectado un obstáculo en la puerta del ascensor en un piso específico
        System.out.println("Notificación: Obstáculo detectado en la puerta del ascensor en el piso " + piso + ". La puerta permanecerá abierta.");
    }
}
