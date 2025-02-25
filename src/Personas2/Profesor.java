package Personas2;

public class Profesor extends Persona{
    String asignatura;
    int añosDeServicio;
    public Profesor(String nombre, int edad, String asignatura, int añosDeServicio){
        this.nombre = nombre;
        this.edad = edad;
        this.asignatura = asignatura;
        this.añosDeServicio = añosDeServicio;
    }
    public void mostrar(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Asignatura: "+asignatura);
        System.out.println("Años Servicio: "+ añosDeServicio);
    }
}
