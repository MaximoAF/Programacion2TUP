package Trabajos_Practicos.TP_Diagnostico.Ejercicio5;
import javax.swing.JOptionPane;
public class Ejercicio5 {


        public static void main(String[] args) {
            // Pedir al usuario que ingrese un número mínimo y un número máximo
            String inputMin = JOptionPane.showInputDialog("Ingrese el número mínimo:");
            String inputMax = JOptionPane.showInputDialog("Ingrese el número máximo:");

            // Convertir los inputs a números enteros
            int min = Integer.parseInt(inputMin);
            int max = Integer.parseInt(inputMax);

            // Validar que el número mínimo sea menor que el número máximo
            if (min >= max) {
                JOptionPane.showMessageDialog(null, "El número mínimo debe ser menor que el número máximo.");
                return; // Salir del programa si la validación falla
            }

            // Mostrar los números primos en el rango especificado
            StringBuilder primos = new StringBuilder("Números primos entre " + min + " y " + max + ":\n");
            for (int i = min; i <= max; i++) {
                if (esPrimo(i)) {
                    primos.append(i).append("\n");
                }
            }

            // Mostrar los números primos en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, primos.toString());
        }

        // Función para verificar si un número es primo
        public static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }

}
