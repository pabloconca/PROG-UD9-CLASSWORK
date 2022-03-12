package Activitat3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Activitat3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cadena = "Numeros introducidos: ";
        String cadAnyadir = "";
        String aux2 = "";
        String aux3 = ", ";
        int contador = 0;
        int aux = 0;
        do {
            try {
            System.out.println("Introduce un numero: ");
            aux = scanner.nextInt();
            cadAnyadir = cadAnyadir.valueOf(aux);
                if (contador >= 1){
                    aux2 = aux2.concat(aux3);
                }
            aux2 = aux2.concat(cadAnyadir);

            System.out.println(cadena.concat(aux2));
            contador++;
            }catch (InputMismatchException a){
                System.out.println("Debes introducir un numero!");
            }
        }while (aux <= 1 || aux >= 5);
    }
}
