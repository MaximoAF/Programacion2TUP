package Clase_1.Ejercicios_de_Herencia.Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(){

        // Creamos los objetos ejemplo
        Caballo caballo1 = new Caballo("Bojack",24,"masculino","noruego","pura sangre");
        Leon leon1 = new Leon("Alex",10,"maculino","leon manchado", "grande");
        Pez pez1 = new Pez("luci",1,"femenino","agua dulce", "carnivoro");

        // Mostramos los objetos y sus metodos
        JOptionPane.showMessageDialog(null,caballo1.informacion() +caballo1.hacerSonido());
        JOptionPane.showMessageDialog(null,leon1.informacion() +leon1.hacerSonido());
        JOptionPane.showMessageDialog(null,pez1.informacion() +pez1.hacerSonido());

    }
}
