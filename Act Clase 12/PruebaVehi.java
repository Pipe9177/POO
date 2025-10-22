public class PruebaVehi {

    public static void main(String[] args) {
        Dron dron1 = new Dron("Casio 3000", 60, 85.0);
        System.out.println("----- PRUEBA DE VEHÍCULOS AÉREOS -----\n");
        dron1.mostrarInfo(); // Muestra la información del dron y es poliformismo
        dron1.despegar();


        System.out.println("------------------------");

        Avion avion1 = new Avion("Boeing 747", 900, 416);
        System.out.println("----- PRUEBA DE VEHÍCULOS AÉREOS -----\n");
        avion1.mostrarInfo(); // Muestra la información del avión y es poliformismo
        avion1.despegar();


        System.out.println("------------------------");

        Helicoptero helicoptero1 = new Helicoptero("Bell 206", 250, 2);
        System.out.println("----- PRUEBA DE VEHÍCULOS AÉREOS -----\n");
        helicoptero1.mostrarInfo(); // Muestra la información del helicóptero y es poliformismo
        helicoptero1.despegar();

    }
}