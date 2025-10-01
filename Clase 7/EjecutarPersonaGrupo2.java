public class EjecutarPersonaGrupo2 {
    public static void main(String[] args) {
        
        //Creación del objeto
        //El operador "new" me permite instanciar(crear) el objeto
        Persona objPersona1 = new Persona(1006234, 
                                            "Juan Manuel", 
                                            "Quijano López", 
                                            23, 
                                            1.80, 
                                            70.3);

        Persona objPersona2 = new Persona(123408, 
                                            "Oscar Daniel", 
                                            "Balanta Villegas", 
                                            17, 
                                            1.84, 
                                            65.0);

        System.out.println(objPersona2.estudiar("Ingeniería de Sistemas"));

        //Tarea: implementar los metodos get y set en la clase Persona
        //dichos métodos utilizarlos en la clase EjecutarPersonaGrupo2
    }
}
