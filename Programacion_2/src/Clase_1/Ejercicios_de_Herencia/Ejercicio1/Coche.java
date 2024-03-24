package Clase_1.Ejercicios_de_Herencia.Ejercicio1;

public class Coche extends Vehiculo {
    private float velocidad;
    private int cilindrada;
    public Coche(String color, int ruedas, float velocidad, int cilindrada){
        super(color, ruedas);
        this.cilindrada = cilindrada;
        this.velocidad = velocidad;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String obtenerAtributos() {
        return super.obtenerAtributos()+
                "velocidad: "+getVelocidad()+"\n" +
                "cilindrada: "+getCilindrada()+"\n";
    }
}
