package Empleados;


public class Tecnico extends Operario{
    public String toString(){
        return "Empleado: "+nombre+"-> Operario -> Tecnico";
    }
    public Tecnico(String nombre){
        super(nombre);
    }
}
