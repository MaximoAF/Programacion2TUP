public class Profesor extends Persona{
    private String titulo;
    public Profesor (String titulo, String nombre, int edad){
        super(nombre,edad);
        this.titulo = titulo;
    }
}
