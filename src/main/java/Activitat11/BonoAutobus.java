package Activitat11;

public class BonoAutobus {
    private int saldo;

    public BonoAutobus(int saldo){
        this.saldo = saldo;
    }
    public void fichar(){
        try {
            System.out.println("Un viaje menos");
            if (saldo == 0){
            throw new SaldoAgotadoException();
            }
        }catch (SaldoAgotadoException a){
            System.out.println(a.getMessage());
        }
    }
}
