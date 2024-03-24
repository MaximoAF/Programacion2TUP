package Clase_4.Ejercicios_en_clase;

public abstract class Canino extends Animal{
    public Canino(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }

    @Override
    public void rugir() {
        System.out.println("rugido de canino");;
    }
}
