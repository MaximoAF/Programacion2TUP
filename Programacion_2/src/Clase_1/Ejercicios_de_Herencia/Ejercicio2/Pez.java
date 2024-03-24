package Clase_1.Ejercicios_de_Herencia.Ejercicio2;

public class Pez extends Animal{
    private String habitat;
    private String alimentacion;

    public Pez(String nombre, int edad, String genero, String habitat, String alimentacion) {
        super(nombre, edad, genero);
        this.habitat = habitat;
        this.alimentacion = alimentacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public String hacerSonido() {
        return "El pez no hace sonido";
    }
    @Override
    public String informacion() {
        return super.informacion()+"habitat: "+ getHabitat()+"\n" +
                "alimentacion: "+ getAlimentacion()+"\n";
    }
}
