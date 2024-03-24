package Clase_1.Ejercicios_de_Herencia.Ejercicio1;
import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main (){

        // Creacion de instancias
        Coche coche1 = new Coche("Verde", 4, 200, 1200);
        Bicicleta bicicleta1 = new Bicicleta("Azul", 2, "Urbana");
        Camioneta camioneta1 = new Camioneta("Rojo",4,180, 1800, 1500);
        Motocicleta motocicleta1 = new Motocicleta("Negro", 2, "Urbana", 150, 1500);

        // Lista de veiculos
        ArrayList<Vehiculo> listVehiculos = new ArrayList<>();

        // Agregacion de vaiculos a la lista
        listVehiculos.add(coche1);
        listVehiculos.add(bicicleta1);
        listVehiculos.add(camioneta1);
        listVehiculos.add(motocicleta1);

        // Ejecutamos el metodo de catalogar
        catalogar(listVehiculos);

        // Ejecutamos el metodo de catalogar con ruedas
        catalogar(listVehiculos,2);



    }

    public static void catalogar(ArrayList<Vehiculo> vehiculos){
        // Creamos un metodo que muestra la clase y atributos de cada veiculo
        for(Vehiculo v: vehiculos)
        JOptionPane.showMessageDialog(null,v.getClass().getSimpleName()+"\n" +
                v.obtenerAtributos());
    }
    public static void catalogar(ArrayList<Vehiculo> vehiculos,int ruedas) {
        // Creamos un metodo que muestra la clase y atributos de cada veiculo dependiendo las ruedas
        int cont = 0;
        for (Vehiculo v : vehiculos){
            if (v.getRuedas() == 2) {
                cont += 1;
            }
        }
        JOptionPane.showMessageDialog(null,"\"Se han encontrado " +  cont +
                " vehículos con "+ruedas+" ruedas:");
        for (Vehiculo v : vehiculos){
            if (v.getRuedas() == 2) {
                JOptionPane.showMessageDialog(null, v.getClass().getSimpleName() + "\n" +
                        v.obtenerAtributos());
            }
        }
    }
}
