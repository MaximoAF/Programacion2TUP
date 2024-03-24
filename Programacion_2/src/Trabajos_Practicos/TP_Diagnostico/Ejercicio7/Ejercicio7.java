package Trabajos_Practicos.TP_Diagnostico.Ejercicio7;
import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese dos operandos y un signo aritmético
        String input1 = JOptionPane.showInputDialog("Ingrese el primer operando:");
        String input2 = JOptionPane.showInputDialog("Ingrese el segundo operando:");
        String signo = JOptionPane.showInputDialog("Ingrese el signo aritmético (+, -, *, /, ^, %):");

        // Convertir los inputs a números enteros
        int operando1 = Integer.parseInt(input1);
        int operando2 = Integer.parseInt(input2);

        // Realizar la operación correspondiente según el signo aritmético
        double resultado = 0;
        switch (signo) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                resultado = (double) operando1 / operando2;
                break;
            case "^":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                resultado = operando1 % operando2;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Signo aritmético no válido.");
                return;
        }

        // Mostrar el resultado en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
    }
}
