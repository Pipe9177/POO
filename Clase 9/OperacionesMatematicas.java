public class OperacionesMatematicas{
    
    //Atributos
    //Sigo sin encontrar mi error en el codigo, ya que no me deja actualizar el repositorio
    private int n1;
    private int n2;

    //Método Constructor de la clase: permite inicializar la clase
    //Tiene el mismo nombre de la clase.
    /*
     * Firma del método constructor
     * visibilidad: público
     * Nombre: OperacionesMatematicas
     * Cuántos parámetros: 2
     * De que tipo son los parametros: 
     *       parametro 1 tipo entero
     *       parámetro 2 tipo entero
     */
    public OperacionesMatematicas(int n1, int n2){
        this.n1 = n1; //this significa una autoreferencia al atributo de la clase
        this.n2 = n2;
    }

    //Métodos
    public int sumar(){
        return n1 + n2;
    }

    public int restar(){
        return n1 - n2;
    }

    public int multiplicar(){
        return n1 * n2;
    }

    public double dividir(){
        double resultado;
        if (n2 == 0){
            resultado = 0.0; 
        }else {
            resultado = (double) n1 / (double) n2;  //Convertir un entero a real 
        }
        return resultado;
        
    }
        public double potencia2(){
        return Math.pow(n1, 2);
    }
    
    public double potenciacubo(){
        return Math.pow(n2, 3);
    }

    public double n(){
        return Math.pow(n1, n2);
    }

    public double raizcuadra(){
        return Math.sqrt(n1);
    }

    public double raizcubic(){
        return Math.pow(n1, 1.0/3);
    }

    public double raizn(){
        return Math.pow(n1, 1.0/n2);
  }
}
