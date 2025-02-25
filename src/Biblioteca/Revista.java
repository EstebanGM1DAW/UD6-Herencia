package Biblioteca;

public class Revista extends Publicacion{
    int numRevista;
    public Revista(String codigoISBN, String titulo, int añoPublicacion,int numRevista){
        super(codigoISBN, titulo, añoPublicacion);
        this.numRevista = numRevista;
    }
    @Override
    public String toString(){
        return "ISBN: "+codigoISBN+", titulo: "+this.titulo+", año de publicacion: "+añoPublicacion;
    }
}
