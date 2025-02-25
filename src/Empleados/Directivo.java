package Empleados;

public class Directivo extends Empleado{
    public String toString(){
        return "Empleado: "+nombre+"-> Directivo";
    }
    public Directivo(String nombre){
        super(nombre);
    }
}
