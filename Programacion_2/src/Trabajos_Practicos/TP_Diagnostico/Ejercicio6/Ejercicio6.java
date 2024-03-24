package Trabajos_Practicos.TP_Diagnostico.Ejercicio6;
import javax.swing.JOptionPane;
public class Ejercicio6 {
    public static void main(String[] args) {
        // Pedir al usuario que ingrese una frase
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");

        // Contadores para las vocales y consonantes
        int vocales = 0;
        int consonantes = 0;

        // Convertir la frase a minúsculas para simplificar la verificación
        frase = frase.toLowerCase();

        // Iterar sobre cada caracter de la frase
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            // Verificar si el caracter es una vocal
            if (esVocal(caracter)) {
                vocales++;
            } else if (Character.isLetter(caracter)) { // Verificar si el caracter es una consonante
                consonantes++;
            }
        }

        // Mostrar la cantidad de vocales y consonantes en un cuadro de diálogo
        JOptionPane.showMessageDialog(null, "La frase ingresada tiene " + vocales + " vocal(es) y " + consonantes + " consonante(s).");
    }

    // Función para verificar si un caracter es una vocal
    public static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}
