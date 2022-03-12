package Activitat10;

abstract public class Animal {
    private boolean vacunado;
    public enum Comida{CARNIVORO,HERVIBORO,OMNIVORO}
    private Comida comida;
    private int hambre;
    public enum Tamanyo{GRANDE, MEDIANO, PEQUE};
    private Tamanyo tamanyo;
    private String localizacion;

    @Override
    public String toString() {
        return  this.getNombre()+ "vacunado = " + vacunado +
                ", hambre=" + hambre +
                ", tamanyo=" + tamanyo +
                ", localizacion='" + localizacion + '\'' +
                '}';
    }

    public Animal(Comida comida, Tamanyo tamanyo, String localizacion) {
        this.comida = comida;
        this.tamanyo = tamanyo;
        this.localizacion = localizacion;
        this.vacunado = false;
        this.hambre = 8;
    }

    public abstract void emitirSonido();

    public abstract String getNombre();
    public void comer(){
        System.out.println("Comiendo un "+ getNombre());
        switch (this.comida){
            case OMNIVORO:
                this.hambre -= 3;
                break;
            case HERVIBORO:
                this.hambre -= 1;
            case CARNIVORO:
                this.hambre -= 2;
                break;
            default:
                System.out.println("ERROR");
        }
    }

    public void setVacunado() {
        System.out.println("VACUNANDO...");
        this.vacunado = true;
        this.emitirSonido();
    }
    public void aparearCon(Animal animal){

    }
}
