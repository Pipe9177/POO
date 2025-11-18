import java.util.Scanner; // Importa la clase Scanner para leer entradas desde la consola

public class Consola {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer entradas
        Ascensor ascensor = new Ascensor(new Puerta(null)); // Crea una instancia del ascensor con una puerta asociada

        System.out.println("Recibiendo solicitudes de ascensor...");



            while(true){
            System.out.println("\n------CONSOLA ASCENSOR------");
            System.out.println("Piso actual:" + ascensor.getPisoActual()); // Muestra el piso actual del ascensor
            System.out.println("1. Presionar botón de piso");
            System.out.println("2. Presionar botón de emergencia");
            System.out.println("3. Presionar botón de mantener abierta la puerta");
            System.out.println("4. Presionar botón de cerrar la puerta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt(); // Lee la opción seleccionada por el usuario

            switch(opcion) {
                case 1:
                    System.out.print("Ingrese el número de piso (0-10): ");
                    int piso = scanner.nextInt();
                    if(piso < 0 || piso > 10) {
                        System.out.println("Número de piso inválido.");
                    } else {
                        System.out.println("Presionando botón de piso " + piso + "...");
                        ascensor.registrarSolicitud(piso); // Registra la solicitud del piso
                       ascensor.mover(); // Llama al motor para procesar la solicitud
                    }
                    break;
                case 2:
                   System.out.println("Presionando botón de emergencia...");
                   ascensor.activarEmergencia(); // Activa la emergencia del ascensor
                   break;
                case 3:
                    System.out.println("Manteniendo la puerta abierta...");
                    break;
                case 4:
                    System.out.println("Cerrando la puerta...");
                    break;
                case 5:
                    System.out.println("Saliendo del sistema de ascensor.");
                    scanner.close(); // Cierra el scanner antes de salir
                    return;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");

                }         
        }
    
    }
}
