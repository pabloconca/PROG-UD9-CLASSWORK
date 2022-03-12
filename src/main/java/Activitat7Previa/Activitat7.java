package Activitat7Previa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Activitat7 {
    public static void main(String[] args) {
        try {
            int edad = getEdad();
            System.out.println("Tu edad es "+edad);
        }catch (InputMismatchException a){
            System.out.println("No se ha podido ejecutar. Motivo: "+a.getMessage());
        }
    }
    private static int getEdad(){
        Scanner scanner = new Scanner(System.in);
        int edad = scanner.nextInt();

        if (edad < 10 || edad > 50){
            throw new InputMismatchException("Edad fuera de rango");
        }
        return edad;
    }
}
