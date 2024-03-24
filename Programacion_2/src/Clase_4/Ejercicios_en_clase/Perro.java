package Clase_4.Ejercicios_en_clase;

public class Perro extends Canino{
    public Perro(String foto, String comida, String localizacion, String tamano) {
        super(foto, comida, localizacion, tamano);
    }

    @Override
    public void hacerRuido() {
        System.out.println("Ruido de perro");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo como perro");
    }

    public void vacunar(){
        System.out.println("Vacunado");
    }

    public void sacarPaseo(){
        System.out.println("Paseando al perro");
    }

}
