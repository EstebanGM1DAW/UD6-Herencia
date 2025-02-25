package Personas2;

public class Alumno extends Persona{
    String clase;
    double notaMedia;
    public Alumno(String nombre, int edad, String clase, double notaMedia){
        this.nombre = nombre;
        this.edad = edad;
        this.clase = clase;
        this.notaMedia = notaMedia;
    }
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Clase: "+clase);
        System.out.println("Nota media: "+ notaMedia);
    }
}
