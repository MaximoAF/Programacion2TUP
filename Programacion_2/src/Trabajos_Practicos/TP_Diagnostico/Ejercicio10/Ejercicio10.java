package Trabajos_Practicos.TP_Diagnostico.Ejercicio10;
import javax.swing.JOptionPane;
public class Ejercicio10 {
    public class PromedioNotasApp {
        public static void main(String[] args) {
            // Pedir al usuario cuántas notas desea ingresar
            String inputCantidad = JOptionPane.showInputDialog("Ingrese la cantidad de notas:");
            int cantidad = Integer.parseInt(inputCantidad);

            // Validar que la cantidad de notas sea válida (mayor que 0)
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(null, "La cantidad de notas debe ser mayor que 0.");
                return;
            }

            // Leer las notas ingresadas por el usuario y calcular la suma total
            double suma = 0;
            for (int i = 0; i < cantidad; i++) {
                String inputNota = JOptionPane.showInputDialog("Ingrese la nota " + (i + 1) + ":");
                double nota = Double.parseDouble(inputNota);
                suma += nota;
            }

            // Calcular y mostrar el promedio de las notas
            double promedio = suma / cantidad;
            JOptionPane.showMessageDialog(null, "El promedio de las notas es: " + promedio);
        }
    }
}
