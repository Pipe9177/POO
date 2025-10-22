public class Vehiculo {
    
    protected String marca;
    protected int velocidad;

    public Vehiculo(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    public void acelerar() {
        velocidad += 10;
    }

    public String info () {
        return " Vehículo " + marca + " va a " + velocidad + " km/h";
    }
}
