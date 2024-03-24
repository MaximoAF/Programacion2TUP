package Trabajos_Practicos.TP_Diagnostico.Ejercicio8;
import javax.swing.JOptionPane;
public class Ejercicio8 {
    public static void main(String[] args) {
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int sumaTotal = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int cantidadNumeros = 0;

        while (true) {
            String input = JOptionPane.showInputDialog("Ingrese un número (o -1 para terminar):");
            int numero = Integer.parseInt(input);

            if (numero == -1) {
                break;
            }

            mayor = Math.max(mayor, numero);
            menor = Math.min(menor, numero);
            sumaTotal += numero;
            cantidadNumeros++;

            if (numero > 0) {
                sumaPositivos += numero;
            } else {
                sumaNegativos += numero;
            }
        }

        double media = (double) sumaTotal / cantidadNumeros;

        JOptionPane.showMessageDialog(null,
                "Mayor número introducido: " + mayor + "\n" +
                        "Menor número introducido: " + menor + "\n" +
                        "Suma de todos los números: " + sumaTotal + "\n" +
                        "Suma de los números positivos: " + sumaPositivos + "\n" +
                        "Suma de los números negativos: " + sumaNegativos + "\n" +
                        "Media de la suma: " + media);
    }
}
