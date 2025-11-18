public class BotonPiso extends Boton {

    private String direccion; // dirección del botón (subir o bajar)

    public BotonPiso(int numero, String direccion) {
        super(numero);
        this.direccion = direccion;
    }

    @Override
    public void presionar(Ascensor ascensor) {
        this.presionado = true;
        System.out.println("Botón de piso " + numero + " para " + direccion + " presionado.");
        ascensor.agregarSolicitudDesdePisoDs(this);
        // Agrega una solicitud al ascensor desde el piso correspondiente sin abrir la puerta en el momento 
        //de la solicitud
    }
}
