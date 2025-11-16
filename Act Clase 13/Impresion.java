public class Impresion extends Producto{
    
    private String color;
    private String tamaño;
    private Foto fotos;
    
    public Impresion(int numero, String nombre, double precio, String descripcion, String color, String tamaño, Foto fotos){
        super(numero, nombre, precio, descripcion);
        this.color = color;
        this.tamaño = tamaño;
        this.fotos = fotos;
    }

    @Override 
    public void print(){
        super.print();
        System.out.println("Impresion de color: " + color + ", tamaño: " + tamaño);
        System.out.println("Foto asociada: ");
        fotos.print();
    }
}
