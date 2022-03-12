package Activitat6;

public class Alumno {
    private String nombre;
    private int edad;
    private int altura;

    public Alumno(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }
    public boolean alumnoMayor(Alumno alumno){
        if (alumno.edad > this.edad){
            return true;
        }
        return false;
    }
}
