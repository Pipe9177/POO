import java.util.Scanner; // Importa la clase Scanner para leer entradas desde la consola

public class Consola {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer entradas
        Controlador controlador = new Controlador(); // Crea una instancia del controlador
        Ascensor ascensor = new Ascensor(controlador); // Recibe el controlador en el constructor del ascensor

        //Organiza las solicitudes generadas por los usuarios

        //Este metodo sirve para llamar al ascensor desde un piso aleatorio, que se diriga alla y despues muestre
        //la interfaz de consola para que el usuario pueda interactuar con el ascensor por dentro

        
        //en caso de que haya una solicitud, el controlador la procesa y le indica al ascensor a qué piso moverse
        System.out.println("\nRecibiendo solicitudes de ascensor...");

        int pisoA = (int)(Math.random() * 11); // Genera un piso aleatorio entre 0 y 10
        int pisoB = (int)(Math.random() * 11); // Genera otro piso aleatorio entre 0 y 10

        Solicitud pA = new Solicitud(pisoA); // Crea una solicitud para el primer piso

        Solicitud pB = new Solicitud(pisoB); // Crea una solicitud para el segundo piso



        controlador.agregarSolicitud(pA); // Agrega la primera solicitud al controlador
        controlador.agregarSolicitud(pB); // Agrega la segunda solicitud al controlador

        controlador.procesar(ascensor); // Procesa las solicitudes y mueve el ascensor en consecuencia


    ascensor.iniciarInterfaz(); // Inicia la interfaz del ascensor
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
                        ascensor.moverAPiso(piso); // Mueve el ascensor al piso seleccionado
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
