public class Garaje {
    public static void main(String[] args) throws Exception {
        
        Motor objMotor = new Motor("FTZ543", "Mercedez");
        Conductor objConductor = new Conductor(84945, "Gabriel");
        
        System.out.println(objMotor);
        System.out.println(objConductor);
        
        Vehiculo objVehiculo = new Vehiculo("POM543", objMotor);
        
        System.out.println(objVehiculo);
        
        objVehiculo.asignarConductor(objConductor);
        
    }
}
