package Banco;

public class Principal {
    public static void main(String[] args){
        CuentaBancaria cuenta1 = new CuentaBancaria("Yesica Martinez", "123456", 1500.0);
        System.out.println("Titular: " + cuenta1 + "\n");
        //Ensayo para depositar
        cuenta1.depositar(500.0);
        //Ensayo para retirar
        cuenta1.retirar(1000.0);
        //Ensayo para retirar más de lo que hay en la cuenta
        cuenta1.retirar(2000.0);
        //Se proyecta el final del saldo
        System.out.println("Saldo final: $" + cuenta1 + "\n");
    }
}
