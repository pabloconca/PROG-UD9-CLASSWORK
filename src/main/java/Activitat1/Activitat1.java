package Activitat1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Activitat1 {
    private static final int NUMEROS = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int i = 0;
        int aux = Integer.MIN_VALUE;
        do {
            try {
                System.out.println("Introduce numero 1:");
                num = scanner.nextInt();
                if (num > aux){
                    aux = num;
                }
                i++;
            } catch (InputMismatchException a) {
                System.out.println("Error. Debes introducir un numero entero");
                scanner.next();
            }
        }while (i < NUMEROS);
    }
}
