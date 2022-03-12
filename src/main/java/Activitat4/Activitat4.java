package Activitat4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Activitat4 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr = pedirNumeros();
        if (arr.isEmpty()){
            System.out.println("Tienes que poner algo campeon");
        }else {
            System.out.println(arr);
        }



    }
    public static ArrayList<Integer> pedirNumeros(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int num = 0;
        boolean daError = false;
        do {
            try {
            System.out.println("Inserte un numero: ");
            num = scanner.nextInt();
            arr.add(num);
            }catch (InputMismatchException a){
                daError = true;
            }
        }while (!daError);
        return arr;
    }
}
