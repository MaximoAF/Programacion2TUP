package Clase_3.Hejercicios_de_Herencia;

public class CuentaCorriente extends Cuenta{
    protected float sobreGiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    public float getSobreGiro() {
        return sobreGiro;
    }

    public void setSobreGiro(float sobreGiro) {
        this.sobreGiro = sobreGiro;
    }

    @Override
    public void consignar(float monto) {
        if (monto > 0){
            if (sobreGiro > 0){
                sobreGiro -= monto;
                if (sobreGiro<=0){
                    monto = sobreGiro*-1;
                    saldo += monto;
                    sobreGiro = 0;
                }
            }else saldo += monto;
            System.out.println("Saldo actual: $"+saldo);
            System.out.println("Sobregiro actual: $"+sobreGiro);
        }else System.out.println("No se puede  consignar $0 o menos");

    }

    @Override
    public void retirar(float monto) {
        if (monto > 0){
            saldo -= monto;
            if (saldo < 0){
                sobreGiro = saldo * -1;
                saldo = 0;
            }
            System.out.println("Saldo actual: $"+saldo );
            System.out.println("Sobregiro actual: $"+sobreGiro);
        }else System.out.println("No se puede hacer un retiro menor o igual a 0");
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    @Override
    public void mostrarActividad(){
        System.out.println("Saldo: "+saldo);
        System.out.println("Comision mensual: "+comisionMensual);
        System.out.println("Numero de transacciones: "+ (numeroRetiros+numeroConsignaciones));
        System.out.println("Sobregiro: " + sobreGiro);
    }
}
