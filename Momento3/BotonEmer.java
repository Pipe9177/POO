// Boton de emergencia dentro del ascensor
// Al presionar este botón, el ascensor debe detenerse inmediatamente y abrir las puertas si es posible.

public class BotonEmer extends Boton {

    public BotonEmer() {
        super(-1); // Número -1 para indicar que es un botón de emergencia y no está asociado a un piso específico
    }

    @Override
    public void presionar(Ascensor ascensor) {
        System.out.println("Botón de emergencia presionado.");
        ascensor.activarEmergencia(); // Detiene el ascensor inmediatamente
        this.presionado = true;
    }
}
