public class BotonAscen extends Boton {

   private int pisoBp; // piso al que se desea ir

    public BotonAscen(int numero, int pisoBp) {
        super(numero);
        this.pisoBp = pisoBp;
    }

    public int getPisoBp() {
        return pisoBp;
    }

    @Override
    public void presionar(Ascensor ascensor) {
        this.presionado = true; // Marca el botón como presionado 
        System.out.println("Botón de ascensor para el piso " + pisoBp + " presionado.");
       ascensor.agregarSolicitudDesdePisoSb(this);

        // Agrega una solicitud al ascensor desde dentro del ascensor sin abrir la puerta

   
    }
}
