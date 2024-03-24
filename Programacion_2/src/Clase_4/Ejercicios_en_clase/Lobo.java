package Clase_4.Ejercicios_en_clase;

public class Lobo extends Canino{
    public Lobo(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Ruido de lobo");
    }

    @Override
    public void comer() {
        System.out.println("Comer como lobo");
    }
}
