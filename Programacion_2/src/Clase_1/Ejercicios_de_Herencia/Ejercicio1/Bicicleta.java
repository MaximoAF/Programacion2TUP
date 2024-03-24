package Clase_1.Ejercicios_de_Herencia.Ejercicio1;

public class Bicicleta extends Vehiculo {
    private String tipo;

    public Bicicleta(String color, int ruedas, String tipo) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String obtenerAtributos() {
        return super.obtenerAtributos()+
                "tipo: "+getTipo()+"\n" ;
    }
}
