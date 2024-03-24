package Trabajos_Practicos.TP_Diagnostico.Ejercicio9;
import javax.swing.JOptionPane;
public class Ejercicio9 {
    public static void main(String[] args) {
        // Solicitar al usuario las dimensiones de las matrices
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas:"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas:"));

        // Crear las matrices
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] resultado = new int[filas][columnas];

        // Ingresar los elementos de la primera matriz
        JOptionPane.showMessageDialog(null, "Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento en la posición [" + i + "][" + j + "]:"));
            }
        }

        // Ingresar los elementos de la segunda matriz
        JOptionPane.showMessageDialog(null, "Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento en la posición [" + i + "][" + j + "]:"));
            }
        }

        // Sumar las dos matrices
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Imprimir la matriz resultante
        StringBuilder resultadoString = new StringBuilder("Matriz resultante:\n");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultadoString.append(resultado[i][j]).append("\t");
            }
            resultadoString.append("\n");
        }

        JOptionPane.showMessageDialog(null, resultadoString.toString());
    }
}
