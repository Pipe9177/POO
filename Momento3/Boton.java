//Clase abstracta Boton para todos los botones del elevador dentro y fuera

public abstract class Boton {
    protected int numero; // número del botón
    protected boolean presionado; // estado del botón si está presionado o no

    public Boton(int numero) {
        this.numero = numero;
        this.presionado = false; // inicialmente no está presionado
    }

    public int getNumero() {
        return numero;
    }

    public boolean isPresionado() {
        return presionado;
    }

    public abstract void presionar(Ascensor Ascensor); // método abstracto para presionar el botón en los diferentes tipos de botones

    public void resetear() {
        this.presionado = false; // método para resetear el estado del botón a no presionado
    }
}
