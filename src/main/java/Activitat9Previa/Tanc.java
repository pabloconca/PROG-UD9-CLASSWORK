package Activitat9Previa;

public class Tanc {
    private int capacidad;
    private int carga;

    public Tanc(int capacidad) {
        this.capacidad = capacidad;
        this.carga = 0;
    }

    public void agregarCarga(int carga) throws TancPleException {
        int diferencia = this.capacidad - this.carga;
        if (diferencia >= carga ){
            this.carga = this.carga + carga;
        }else {
            throw new TancPleException();
        }
    }
    public void retirarCarga(int carga) throws TancBuitException{
        int diferencia = this.carga - carga;
        if (diferencia <= 0 ){
            throw new TancBuitException();
        }
        this.carga = this.carga - carga;

    }

    public int getCarga() {
        return carga;
    }
}
