package Clase_1.Ejercicios_de_Herencia.Ejercicio2;

public class Leon extends Animal{
    private String origen;
    private String tamanio;

    public Leon(String nombre, int edad, String genero, String origen, String tamanio) {
        super(nombre, edad, genero);
        this.origen = origen;
        this.tamanio = tamanio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String hacerSonido() {
        return "El leon ruge";
    }
    @Override
    public String informacion() {
        return super.informacion()+"tamaño: "+ getTamanio()+"\n" +
                "origen: "+ getOrigen()+"\n";
    }
}
