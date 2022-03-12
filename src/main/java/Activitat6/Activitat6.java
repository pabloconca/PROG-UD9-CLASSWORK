package Activitat6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Activitat6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean aux = false;
        do {

            try {
                System.out.println("Introduce datos de alumno 1: ");
                System.out.println("Nombre: ");
                String nombre1 = scanner.next();
                System.out.println("Edad: ");
                int edad1 = scanner.nextInt();
                System.out.println("Altura : ");
                int altura1 = scanner.nextInt();

                System.out.println("Introduce datos de alumno 2: ");
                System.out.println("Nombre: ");
                String nombre2 = scanner.next();
                System.out.println("Edad: ");
                int edad2 = scanner.nextInt();
                System.out.println("Altura : ");
                int altura2 = scanner.nextInt();
                aux = true;
                Alumno alumno1 = new Alumno(nombre1, edad1, altura1);
                Alumno alumno2 = new Alumno(nombre2, edad2, altura2);
                System.out.println(alumno1.toString());
                System.out.println(alumno2.toString());
                boolean esMayor = alumno1.alumnoMayor(alumno2);
                if (esMayor) {
                    System.out.println("Alumno 2 es mayor que alumno 1");
                } else {
                    System.out.println("Alumno 1 es mayor que alumno 2");
                }
            } catch (InputMismatchException a) {
                System.out.println("Has insertado una letra!");
            }
        }while (!aux);
    }

}
