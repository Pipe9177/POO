package Banco;

public class CuentaBancaria {
    
    private String titular;
    private String numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, String numeroCuenta, double saldo){
        //Recuerda el != es diferente de null sirve para validar que el dato no sea nulo
        //El metodo isEmpty() sirve para validar que la cadena no esté vacía
        //El !titular.isEmpty() es diferente de cadena vacía
        if (titular != null && !titular.isEmpty()){
            this.titular = titular;
        } else {
            this.titular = "No definido";
        }
        if (numeroCuenta != null && numeroCuenta.length() >= 6){
            this.numeroCuenta = numeroCuenta;
        } else {
            this.numeroCuenta = "000000";
        }
        if (saldo >= 0){
            this.saldo = saldo;
        } else {
            this.saldo = 0.0;
        }
    }
    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        if (titular != null && !titular.isEmpty()){
            this.titular = titular;
        } else {
            System.out.println("Error: El nombre del titular no puede ser nulo o vacío.");
        }
    }
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta){
        if (numeroCuenta != null && numeroCuenta.length() >= 6){
            this.numeroCuenta = numeroCuenta;
        } else {
            System.out.println("Error: El número de cuenta debe tener al menos 6 caracteres.");
        }
    }
    public double getSaldo(){
        return saldo;
    }
    //No se crea el setter para el saldo porque no se debe modificar directamente
    //El saldo solo se modifica a través de depositar y retirar
  public void depositar(double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: El monto a depositar debe ser positivo.");
        }
    }
    public void retirar(double monto){
        if (monto > 0 && monto <= saldo){
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        } else if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes para el retiro.");
        } else {
            System.out.println("Error: El monto a retirar debe ser positivo.");
        }
    }
    @Override
    public String toString(){
        return "Titular: " + titular + "\nNúmero de Cuenta: " + numeroCuenta + "\nSaldo: $" + saldo;
    }
}
