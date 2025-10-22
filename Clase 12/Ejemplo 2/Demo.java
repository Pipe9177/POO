public class Demo {
    public static void main(String[] args) {
        
        Vehiculo v1 = new Auto(" Toyota ", 4);
        Vehiculo v2 = new Moto(" Yamaha ");
        
        v1.acelerar();
        v2.acelerar();
        
        System.out.println(v1.info());
        System.out.println(v2.info());
    }
}
