package Empleados;

public abstract class Empleado {
    protected String nombre;
    public Empleado(String nombre){
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract String toString();
}
