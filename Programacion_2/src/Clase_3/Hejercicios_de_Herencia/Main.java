package Clase_3.Hejercicios_de_Herencia;

public class Main {
    public static void main (){

        //creamos los objetos de las cuentas
        CuentaAhorros CA1 = new CuentaAhorros(5000, 130);
        CuentaAhorros CA2 = new CuentaAhorros(25000, 150);

        CuentaCorriente CC1 = new CuentaCorriente(23000,105);
        CuentaCorriente CC2 = new CuentaCorriente(14500,95);

        //realizamos pruebas de consignacion
        CA1.consignar(1000);
        CA2.consignar(1000);
        CC1.consignar(1000);
        CC2.consignar(-1000);

        //realizamos pruebas de retirar
        CA1.retirar(1000);
        CA2.retirar(5000);
        CC1.retirar(30000);
        CC2.retirar(-1000);

        //realizamos pruebas de consignacion
        CA1.consignar(1000);
        CA2.consignar(1000);
        CC1.consignar(7000);
        CC2.consignar(-1000);

        CA2.retirar(1000);
        CA2.retirar(2000);
        CA2.retirar(1000);
        CA2.retirar(2000);


        //mostrar resulatados
        CA1.mostrarActividad();
        CA2.mostrarActividad();
        CC1.mostrarActividad();
        CC2.mostrarActividad();


    }
}
