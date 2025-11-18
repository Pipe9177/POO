public class BotonAbrir extends Boton {

    public BotonAbrir(int numero) {
        super(numero);
    }

    @Override
    public void presionar(Ascensor ascensor) {
        System.out.println("Botón de abrir puerta presionado en el piso " + numero + ".");
        if(ascensor.getPisoActual() == numero) {
        } else {
            System.out.println("El ascensor no está en este piso. No se puede abrir la puerta.");
           
        }
        this.presionado = true;
    }
}
