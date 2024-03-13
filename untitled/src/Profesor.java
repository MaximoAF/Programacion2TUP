public class Profesor extends Persona{
    private String titulo;
    public Profesor (String titulo, String nombre, int edad){
        super(nombre,edad);
        this.titulo = titulo;
    }
    //metodo get y set para obtener  y asignar el valor de la variable titulo
    public String getTitulo(){return titulo;}
    public void setTitulo(String titulo){this.titulo=titulo;}
}
