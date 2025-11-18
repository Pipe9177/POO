public class Sensor {
    private volatile boolean obstaculoDetec; // indica si hay un obstáculo detectado

    public Sensor() {
        this.obstaculoDetec = false; // inicialmente no hay obstáculo
    }
     
    public boolean isObstaculoDetec() {
        return obstaculoDetec;
    }

    public void setObstaculoDetec(boolean obstaculoDetec) {
        this.obstaculoDetec = obstaculoDetec;
        System.out.println("Sensor de obstáculo actualizado: " + obstaculoDetec);
    }
    
}
