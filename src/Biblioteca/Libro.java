package Biblioteca;
public class Libro extends Publicacion implements Prestamo{
    boolean prestado;

    public Libro(String codigoISBN, String titulo, int añoPublicacion) {
        super(codigoISBN, titulo, añoPublicacion);
        this.prestado = false;
    }

    @Override
    public String toString() {
        String pres = "no prestado";
        if (prestado) {
            pres = "prestado";
        }
        return "ISBN: " + codigoISBN + ", titulo: " + this.titulo + ", año de publicacion: " + añoPublicacion + " ("
                + pres + ")";
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void presta() {
        if (prestado == false) {
            prestado = true;
        } else {
            System.out.println("Lo siento, Ese libro ya esta prestado");
        }
    }

    public void devuelve() {
        if (prestado == false) {
        } else {
            prestado = false;
        }
    }

    public boolean estaPrestado(){
        return prestado;
    }
}
