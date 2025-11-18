public class BotonMantener extends Boton {

    public BotonMantener() {
        super(-1); // El botón de mantener no tiene un número de piso asociado
    }

    @Override
    public void presionar(Ascensor ascensor) {
        System.out.println("Botón de mantener puerta abierta presionado.");
        ascensor.getPuerta().setMantenerAbierta(!ascensor.getPuerta().isMantenerAbierta());
        this.presionado = true;
       
    }
}