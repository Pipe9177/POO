import java.util.Scanner;

public class EjecutarOpeMat {
    public static void main(String[] args) {
        //Clase Scanner para leer datos por teclado
        Scanner sc = new Scanner(System.in);

            int modo;
             
        do{
        System.out.print("Digite el primer número...");
        //Con el objeto sc llamamos los metodos de la clase Scanner, por ejemplo: sc.nextInt()
        int a = sc.nextInt();
        System.out.print("Digite el segundo número...");
        int b = sc.nextInt();
        /*
         * Para leer enteros: nextInt() ó nextLong()
         * Para leer reales: nextDouble() ó nextFloat()
         * para leer cadenas: next() ó nextLine()
         * para leer booleanos: nextBoolean()
         */
        OperacionesMatematicas objOp = new OperacionesMatematicas(a,b);

        System.out.println("---Calculadora Mecanica---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Elevar al cuadrado");
        System.out.println("6. Elevar al cubo");
        System.out.println("7. Elevar a la n");
        System.out.println("8. Raíz cuadrada");
        System.out.println("9. Raíz cúbica");
        System.out.println("10. Raíz n");
        System.out.println("11. Salir");
        System.out.println("--------------------------");
        System.out.print("Digite la opción a realizar...");

        modo = sc.nextInt();

        switch(modo){
            case 1:
                System.out.println("La suma es: " + objOp.sumar());
                break;
            case 2:
                System.out.println("La resta es: " + objOp.restar());
                break;
            case 3:
                System.out.println("La multiplicación es: " + objOp.multiplicar());
                break;
            case 4:
                System.out.println("La división es: " + objOp.dividir());
                break;
            case 5:
                System.out.println("Elevar al cuadrado" + objOp.potencia2());
                break;
            case 6:
                System.out.println("Elevar al cubo" + objOp.potenciacubo());
                break;
            case 7:
                System.out.println("Elevar a la n" + objOp.n());
                break;
            case 8:
                System.out.println("Raíz cuadrada" + objOp.raizcuadra());
                break;
            case 9:
                System.out.println("Raíz cúbica" + objOp.raizcubic());
                break;
            case 10:
                System.out.println("Raíz n" + objOp.raizn());
                break;
            case 11:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opción no válida");
        }
    } while(modo != 11);
        sc.close(); //Cerramos el flujo de entrada de datos
        System.out.println("Gracias por usar la calculadora");
    }
} 




