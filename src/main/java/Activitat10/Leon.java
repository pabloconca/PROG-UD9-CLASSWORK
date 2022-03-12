package Activitat10;

public class Leon extends Animal {

    public Leon(String localizacion) {
        super(Comida.CARNIVORO, Tamanyo.GRANDE, localizacion);
    }

    @Override
    public void emitirSonido() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAr");
    }

    @Override
    public String getNombre() {
        return "Tigre";
    }
}
