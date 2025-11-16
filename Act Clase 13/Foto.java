public class Foto {

    private String fichero;
    private String formato;
    private double tamano;

    public Foto(String fichero, String formato, double tamano){
        this.fichero = fichero;
        this.formato = formato;
        this.tamano = tamano;
    }

    public void print(){
        System.out.println("----Imprimiendo foto: " + fichero + "-----\n");
        System.out.println("----Formato: " + formato + ", tamaño: " + tamano + " MB-----\n");
    }
}
