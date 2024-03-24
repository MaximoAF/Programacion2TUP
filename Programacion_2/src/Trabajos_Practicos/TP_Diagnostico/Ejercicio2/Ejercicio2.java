package Trabajos_Practicos.TP_Diagnostico.Ejercicio2;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(){
        //Ingresamos la opcion y temperatura
        String option = JOptionPane.showInputDialog("Ingrese una opcion:\n" +
                "1. convertir Cº a Fº\n" +
                "2. Convertir Fº a Cº");
        String input1 = JOptionPane.showInputDialog(null, "Ingrese la temperatura:" );
        int temp = Integer.parseInt(input1);

        //Ejecutamos segun la opcion
        switch (option){
            case "1":
                JOptionPane.showMessageDialog(null,temp +"Cº = " + toFaren(temp)+"Fº");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, temp + "Fº = "+ toCel(temp)+ "Cº");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida.");
        }
    }
    public static float toFaren(int cel){
        return (cel * 9/5)+32;
    }
    public static float toCel(int far){
        return (far -32)*5/9;
    }
}
