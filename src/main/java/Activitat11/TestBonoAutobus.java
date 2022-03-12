package Activitat11;

public class TestBonoAutobus {
    public static void main(String[] args) {
        int saldo = 10;
        for (int i = 0; i <11 ; i++) {
            BonoAutobus bono = new BonoAutobus(saldo);
            bono.fichar();
            saldo--;
        }
    }
}
