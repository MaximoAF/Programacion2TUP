package Clase_1.Ejercicios_de_Herencia.Ejercicio2;

public class Caballo extends Animal{
    private String Raza;
    private String Pureza;

    public Caballo(String nombre, int edad, String genero, String raza, String pureza) {
        super(nombre, edad, genero);
        Raza = raza;
        Pureza = pureza;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }

    public String getPureza() {
        return Pureza;
    }

    public void setPureza(String pureza) {
        Pureza = pureza;
    }

    @Override
    public String hacerSonido() {
        return "El caballo relincha";
    }

    @Override
    public String informacion() {
        return super.informacion()+"raza: "+ getRaza()+"\n" +
                "pureza: "+ getPureza()+"\n";
    }
}
