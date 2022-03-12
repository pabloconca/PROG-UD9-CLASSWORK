package Activitat8Previa;

public class WaitApp {
    public static void main(String[] args) {
        try {
            waitSeconds(5);
            System.out.println("Hasta Luego");
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
    private static void waitSeconds(int segundos) throws InterruptedException{
        Thread.sleep(segundos * 1000);
    }
}
