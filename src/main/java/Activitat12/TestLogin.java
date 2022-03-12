package Activitat12;

import java.util.HashMap;
import java.util.Scanner;

public class TestLogin {
   private final static String USER = "pepe";
    private final static String PASSWORD = "pepe";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 3;
        do {
            System.out.println("Introduce tu nombre: ");
            String nombre = scanner.next();
            System.out.println("Introduce una contrasenya");
            String contrasenya = scanner.next();

            HashMap<String, String> credencialesUsuario = new HashMap<>();
            credencialesUsuario.put(nombre, contrasenya);

            HashMap<String, String> credenciales = new HashMap<>();
            credenciales.put(USER, PASSWORD);
            LoginService loginService = new LoginService(credenciales);

            try {
                loginService.login(nombre, contrasenya);
                return;
            } catch (CredencialesInvalidasException a) {
                System.out.println(a.getMessage());
            }
            intentos--;
        }while (intentos > 0);
    }
}
