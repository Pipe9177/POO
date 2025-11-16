import java.util.Date;

public class Tienda {
    
    public static void main(String[] args) {

        Camara camara1 = new Camara(2, "Cámara Nikon", 1200.0, "Cámara réflex digital", "24MP", "Réflex");      
        Foto foto1 = new Foto("paisaje.jpg", "JPEG", 5.0);
        Impresion impresion1 = new Impresion(3, "Impresión Paisaje", 50.0, "Impresión de alta calidad", "Color", "A4", foto1);  
        Cliente cliente1 = new Cliente(12345678, "Juan Pérez");
        Date fechaPedido = new Date();
        Pedido pedido1 = new Pedido(cliente1, impresion1, fechaPedido, 12, "En proceso");
        pedido1.print();
        camara1.print();
        impresion1.print();

    }


}
