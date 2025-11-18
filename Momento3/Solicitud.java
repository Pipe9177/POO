
// Clase que representa una solicitud de un elevador a un piso específico desde afuera

public class Solicitud {
    private int piso; // piso al que se desea ir
    private boolean abrirPuerta; // indica si se debe abrir la puerta al llegar

    public Solicitud(int piso, boolean abrirPuerta) {
        this.piso = piso;
        this.abrirPuerta = abrirPuerta;
    }

    public int getPiso() {
        return piso;
    }

    public boolean isAbrirPuerta() { // getter para abrirPuerta si esta en true
        return abrirPuerta;
    }

    @Override
    public String toString() {
        return "Solicitud:" + "piso =" + piso + ", abrirPuerta =" + abrirPuerta;

    }
}