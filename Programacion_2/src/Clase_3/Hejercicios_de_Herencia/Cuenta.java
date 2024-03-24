package Clase_3.Hejercicios_de_Herencia;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }

    public void consignar(float monto){
        if (monto <= 0) System.out.println("No se pudo consignar el monto");
        else {
            saldo += monto;
            numeroConsignaciones ++;
            System.out.println("Saldo actual: $"+saldo);
        }

    }
    public void retirar(float monto){
        if (monto <= 0 && monto > saldo) System.out.println("No se pudo retirar el monto");
        else {
            saldo -= monto;
            numeroRetiros ++;
            System.out.println("Saldo actual: $"+saldo);
        }
    }
    public void calcularInteresMensual() {
        float interesMensual = saldo * (tasaAnual / 12);
        saldo += interesMensual;
        System.out.println("Saldo actual: $"+saldo);
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteresMensual();
    }

    public void mostrarActividad() {
        System.out.println("saldo=" + saldo );
        System.out.println("numeroConsignaciones=" + numeroConsignaciones);
        System.out.println("numeroRetiros=" + numeroRetiros );
        System.out.println("tasaAnual=" + tasaAnual );
        System.out.println("comisionMensual=" + comisionMensual );
    }
}
