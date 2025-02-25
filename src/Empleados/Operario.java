package Empleados;


public abstract class Operario extends Empleado{
    @Override
    public abstract String toString();
    
    public Operario(String nombre){
        super(nombre);
    }
}
