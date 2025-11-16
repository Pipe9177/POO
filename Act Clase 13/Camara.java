public class Camara extends Producto {
    
    private String resolucion;
    private String tipo;
    
    public Camara(int numero, String nombre, double precio, String descripcion, String resolucion, String tipo){
        super(numero, nombre, precio, descripcion);
        this.resolucion = resolucion;
        this.tipo = tipo;
    }

    @Override 
    public void print(){
        super.print();
        System.out.println("Cámara de resolución: " + resolucion + ", tipo: " + tipo);
    }
    
}
