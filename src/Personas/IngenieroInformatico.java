package Personas;
public class IngenieroInformatico extends Ingeniero{
    int numeroPuesto;

    public IngenieroInformatico(String nif, double altura, int edad, int numeroPuesto, String herramienta) {
        super(nif, altura, edad,herramienta);
        this.numeroPuesto = numeroPuesto;
    }

    public int getNumeroPuesto() {
        return numeroPuesto;
    }

    public void setNumeroPuesto(int numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }
    
    public void crearPrograma(){
        System.out.println("Creando");
    }

    @Override
    public String toString() {
        return "IngenieroInformatico: [nif=" + nif + ", altura=" + altura + ", numeroPuesto=" + numeroPuesto + ", edad="
                + edad + "]";
    }

    
}
