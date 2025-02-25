package Personas;
public class Ingeniero extends Persona{
    public String herramienta;
    public Ingeniero(String nif, double altura, int edad, String herra){
        super(nif, altura, edad);
        this.herramienta = herra;
    }

    public String getHerramienta() {
        return herramienta;
    }

    public void TrabajarEnGrupo(){
        System.out.println("Trabajando");
    }

    public void Razonar(){
        System.out.println("Razonando");
    }

    @Override
    public String toString() {
        return "Ingeniero [nif=" + nif + ", altura=" + altura + ", herramienta=" + herramienta + ", edad=" + edad + "]";
    }

    
}
