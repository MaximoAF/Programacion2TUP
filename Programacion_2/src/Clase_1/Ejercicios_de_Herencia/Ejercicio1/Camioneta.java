package Clase_1.Ejercicios_de_Herencia.Ejercicio1;

public class Camioneta extends Coche{
    private int carga;

    public Camioneta(String color, int ruedas, float velocidad, int cilindrada, int carga) {
        super(color, ruedas, velocidad, cilindrada);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String obtenerAtributos() {
        return super.obtenerAtributos()+
                "carga: "+getCarga()+"\n";
    }
}
