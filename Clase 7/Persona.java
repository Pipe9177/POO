public class Persona {

    //Atributos
    private int identificacion;
    private String nombres;
    private String apellidos;
    private int edad;
    private double estatura;
    private double peso;

    //Método constructor de la clase se reconoce porque tiene el mismo nombre de la clase
    //El constructor de la clase me permite inicializar la clase
    //la palabra reservada "this" se utiliza para autoreferenciar el atributo de la clase
    public Persona(int identificacion, String nombres, String apellidos, int edad, double estatura, double peso){
       this.identificacion = identificacion;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.edad = edad;
       this.estatura = estatura;
       this.peso = peso;
    }

    //Métodos
    public void caminar(){
        System.out.println("Caminar");
    }

    public boolean jugar(){
        return true;
    }

    public void comer(){
        System.out.println("Comiendo");
    }

    public String estudiar(String carrera){
        return "Usted está estudiando: " + carrera;
    }

    //Tarea consultar sobre el método toString.
    
}