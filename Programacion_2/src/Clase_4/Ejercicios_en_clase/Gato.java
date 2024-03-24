package Clase_4.Ejercicios_en_clase;

public class Gato extends Felino{
    public Gato(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Ruido de gato");
    }

    @Override
    public void comer() {
        System.out.println("comer como gato");
    }
    public void vacunar(){
        System.out.println("Vacunado");
    }
}
