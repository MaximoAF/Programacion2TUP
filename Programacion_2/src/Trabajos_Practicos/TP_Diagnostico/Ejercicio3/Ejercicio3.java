package Trabajos_Practicos.TP_Diagnostico.Ejercicio3;


import javax.swing.*;

public class Ejercicio3 {
    public static void main(){
        // Pedir al usuario que ingrese dos números
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número:");
        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número:");

        // Convertir los inputs a números enteros
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        // Generar 10 números aleatorios entre los dos números ingresados por el usuario
        String result = "Los 10 números aleatorios entre " + num1 + " y " + num2 + " son:\n";
        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = (int) (Math.random() * (Math.max(num1, num2) - Math.min(num1, num2) + 1) + Math.min(num1, num2));
            result = result + numeroAleatorio+"\n";
        }

        // Mostrar los resultados en un JOptionPane
        JOptionPane.showMessageDialog(null, result);
    }
}
