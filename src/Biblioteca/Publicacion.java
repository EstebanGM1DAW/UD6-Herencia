package Biblioteca;

public class Publicacion {
    String codigoISBN;
    String titulo;
    int añoPublicacion;
    public Publicacion(String codigoISBN, String titulo, int añoPublicacion){
        this.codigoISBN = codigoISBN;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }
    public String getCodigoISBN() {
        return codigoISBN;
    }
    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAñoPublicacion() {
        return añoPublicacion;
    }
    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
    
}
