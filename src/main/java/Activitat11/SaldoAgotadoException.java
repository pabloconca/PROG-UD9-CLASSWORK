package Activitat11;

public class SaldoAgotadoException extends Exception{
    public SaldoAgotadoException(){
        super("Saldo insuficiente!");
    }
}
