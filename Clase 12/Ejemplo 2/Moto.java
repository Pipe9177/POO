public class Moto extends Vehiculo {
    
    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        velocidad += 20;
    }

    @Override
    public String info() {
        return " Moto " + marca + " va a " + velocidad + " km/h";
    }
}
