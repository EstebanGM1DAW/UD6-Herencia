package Personas;
public class Persona {
    String nif;
    double altura;
    int edad;

    public Persona(String nif, double altura, int edad) {
        if (nif != null) {
            this.nif = nif;

        } else {
            this.nif = "11111111A";
        }
        if (altura != 0) {
            this.altura = altura;

        } else {
            this.altura = 175;
        }
        if (edad != 0) {
            this.edad = edad;

        } else {
            this.edad = 25;
        }
    }

    @Override 
    public String toString(){
        return "Nif: "+this.nif + " mide " + this.altura + " y tiene " + this.edad + " años.";
    }

    public String getNif() {
        return nif;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String hablar(){
        return "Bla, bla, bla...";
    }

    
}
