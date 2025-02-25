package Empleados;


public class Oficial extends Operario{
    public String toString(){
        return "Empleado: "+nombre+"-> Operario -> Oficial";
    }
    public Oficial(String nombre){
        super(nombre);
    }
    
}
