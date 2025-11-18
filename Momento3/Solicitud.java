
// Clase que representa una solicitud de un elevador a un piso específico desde afuera

public class Solicitud {
    private int piso; // piso al que se desea ir


    public Solicitud(int piso) {
        this.piso = piso;

    }

    public int getPiso() {
        return piso;
    }

    public String direccion(int pisoActual) {
        if(pisoActual < piso) {
            return "Subiendo";
        } else if (pisoActual > piso) {
            return "Bajando";
        } else {
            return "En el mismo piso";
        }
    }

    @Override
    public String toString() {
        return "Solicitud:" + "piso =" + piso;

    }
}