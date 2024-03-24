package Trabajos_Practicos.TP_Diagnostico.Ejercicio4;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(){
        // Pedir al usuario que ingrese dos números
        String input1 = JOptionPane.showInputDialog("Ingrese un número:");
        int num = Integer.parseInt(input1);

        //variable para verificar si es primo o no
        boolean isPrimo = true;

        //Verificamos si es primo con un for
        for(int i = 2 ; i < num ; i++){
            if(num % i == 0){
                isPrimo = false ;
                break;
            }
            System.out.println(i);
        }

        //resulataso de salida

        JOptionPane.showMessageDialog(null,"El numero "+num+(isPrimo?" si ":" no ")+ "es primo" );

    }
}
