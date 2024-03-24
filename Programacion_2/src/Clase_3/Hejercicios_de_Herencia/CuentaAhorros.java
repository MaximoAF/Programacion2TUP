package Clase_3.Hejercicios_de_Herencia;

public class CuentaAhorros extends Cuenta{

    protected boolean activa;


    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.activa = saldo >= 10000;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    @Override
    public void consignar(float monto){
        if (activa) super.consignar(monto);
        else System.out.println("la cuenta esta inactiva");
    }
    @Override
    public void retirar(float monto){
        if (activa) super.retirar(monto);
        else System.out.println("la cuenta esta inactiva");
    }
    @Override
    public void extractoMensual() {
        if (saldo >= 10000){
            if (numeroRetiros > 4){
                comisionMensual += (numeroRetiros-4)*1000;
            }
            super.extractoMensual();
        }
        else System.out.println("la cuenta esta inactiva");

    }
    @Override
    public void mostrarActividad(){
        System.out.println("Saldo: "+saldo);
        System.out.println("Comision mensual: "+comisionMensual);
        System.out.println("Numero de transacciones: "+ (numeroRetiros+numeroConsignaciones));
    }


}
