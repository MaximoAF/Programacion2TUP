package Clase_1.Ejercicios_de_Herencia.Ejercicio2;

public class Animal {
    private String nombre;
    private int edad;
    private String genero;

    public Animal(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String hacerSonido(){
        return "El animal hace un sonido genérico";
    }

    public String informacion() {
        return "nombre: " + nombre + "\n" +
                "edad: " + edad + "\n" +
                "genero: " + genero + "\n";
    }
}
