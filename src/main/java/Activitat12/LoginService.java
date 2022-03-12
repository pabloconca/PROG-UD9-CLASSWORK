package Activitat12;

import java.util.HashMap;
import java.util.Scanner;

public class LoginService {
    private static final int MAX_ATTEMPTS = 3;
    private int attempts;
    private HashMap<String,String> credenciales;

    public LoginService(HashMap<String, String> credenciales) {
        this.attempts = 0;
        this.credenciales = credenciales;
    }

    public void login(String usuario, String password) throws MaximoIntentosAlcanzadosException, CredencialesInvalidasException {
            this.attempts++;
            if (credenciales.containsKey(usuario) && credenciales.containsValue(password)) {
                System.out.println("Has accedido al area restringida");
            } else if (!hasPendingAttempts()) {
                throw new MaximoIntentosAlcanzadosException();
            } else if (!credenciales.containsKey(usuario)){
                throw new CredencialesInvalidasException("El user introducido no existe");
            }else {
                throw new CredencialesInvalidasException("La password introducida no es correcta");
            }
    }
    public void resetAttempts(){
        this.attempts = 0;
    }
    private boolean hasPendingAttempts(){
        if (this.attempts <MAX_ATTEMPTS){
            return true;
        }else {
            return false;
        }
    }
}
