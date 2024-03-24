package Trabajos_Practicos.TP_Diagnostico.Ejercicio1;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(){
        int num1 = Integer.parseInt( JOptionPane.showInputDialog(null,"Ingllresa el primer numero: "));
        int num2 = Integer.parseInt( JOptionPane.showInputDialog(null,"Ingllresa el segundo numero: "));

        String option = JOptionPane.showInputDialog("Elige una opción: \n" +
                "1.Sumar \n" +
                "2.Restar \n" +
                "3.Multiplicar \n" +
                "4.Dividir");
        switch (option) {
            case "1":
                JOptionPane.showMessageDialog(null,num1 +"+"+num2 + "=" +addNumbers(num1, num2));
                break;
            case "2":
                JOptionPane.showMessageDialog(null,num1 +"-"+num2 + "=" +subtractNumbers(num1, num2));
                break;
            case "3":
                JOptionPane.showMessageDialog(null,num1 +"*"+num2 + "=" +multiplyNumbers(num1, num2));
                break;
            case "4":
                JOptionPane.showMessageDialog(null,num1 +"/"+num2 + "=" +splitNumbers(num1, num2));
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción invalida");
                break;




        }
    }
    public static int addNumbers (int num1, int num2){
        return num1 + num2;
    }
    public static int subtractNumbers (int num1, int num2){
        return num1 - num2;
    }
    public static int multiplyNumbers (int num1, int num2 ){
        return num1 * num2;
    }
    public static float splitNumbers (int num1, int num2){
        return num1 / num2;
    }
}
