package Activitat10;

public class Hipopotamo extends Animal {
    public Hipopotamo(String localizacion) {
        super(Comida.OMNIVORO, Tamanyo.GRANDE, localizacion);
    }
    @Override
    public void emitirSonido(){
        System.out.println("*Hipopotamo noises*");
    }

    @Override
    public String getNombre() {
        return "Hipopotamo";
    }
}
