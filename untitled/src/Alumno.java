public class Alumno extends Persona{

    String legajo;
    public Alumno(String legajo, String nombre, int edad) {
        super(nombre, edad);
        this.legajo = legajo;
    }
    public void comer(){
        System.out.println("Yo como fideos");
    }
}
