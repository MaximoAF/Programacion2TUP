package Clase_1.Ejercicios_de_Herencia.Ejercicio1;

public class Motocicleta extends Bicicleta{
    private float velocidad;
    private int cilindrada;

    public Motocicleta(String color, int ruedas, String tipo, float velocidad, int cilindrada) {
        super(color, ruedas, tipo);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
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
