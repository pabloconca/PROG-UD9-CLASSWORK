package Activitat9Previa;

public class TestTanc {
    public static void main(String[] args) {
        Tanc tanc = new Tanc(100);
        try{
            tanc.agregarCarga(110);
            tanc.retirarCarga(20);
            System.out.println(tanc.getCarga());
        }catch (TancPleException ple){
            System.out.println(ple.getMessage());
        }catch (TancBuitException buit){
            System.out.println(buit.getMessage());
        }

    }
}
