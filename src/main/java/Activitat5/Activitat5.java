package Activitat5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Activitat5 {
    public static void main(String[] args) {

    }
    public static void readNumbers(int [] numbers,int numElements){
        Scanner scanner = new Scanner(System.in);
        numbers = new int[numElements];
        int num = 0;

        for (int i = 0; i <numbers.length ; i++) {
            try {
                System.out.println("Inserte un numero: ");
                num = scanner.nextInt();
                numbers[i] = num;
            }catch (InputMismatchException a){
                System.out.println("Has puesto una letra");
            }catch (IndexOutOfBoundsException bounds){
                System.out.println("Te has pasado el array");
                for (int j = 0; j < numbers.length ; j++) {
                    System.out.println(numbers[i]);
                }
                return;
            }catch(NullPointerException pointer){
                System.out.println("Tienes que inicializar el array");
                return;
            }
        }

    }
}
