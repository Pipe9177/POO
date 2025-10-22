public class Auto extends Vehiculo {
    
    private int puertas;

    public Auto(String marca, int puertas) {
        super(marca);
        this.puertas = puertas;
    }

    @Override
    public void acelerar() {
        velocidad += 15;
    }

    @Override
    public String info () {
        return " Auto " + marca + " ( " + puertas + " puertas ) va a " + velocidad + " km/h" ;
    }
}
