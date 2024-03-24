package Clase_4.Ejercicios_en_clase;

public class Leon extends Felino{
    public Leon(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Ruido de leon");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo como leon");
    }
}
