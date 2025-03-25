package Vehiculo;

public class Coche extends Vehiculo implements Arrancable{
    int kilometrosRecorridos;
    boolean arrancado;
    public Coche(int kmReco) {
        this.kilometrosRecorridos = kmReco;
        kilometrosTotales = kilometrosTotales+kmReco;
        vehiculosCreados++;
    }
    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
    public void quemarRueda(){
        System.out.println("🔥 Quemando rueda...");
    }
    public void andarCoche(int km){
        kilometrosRecorridos = kilometrosRecorridos + km;
        kilometrosTotales = kilometrosTotales+km;
    }
    @Override
    public String toString() {
        return "KilometrosRecorridos:" + kilometrosRecorridos;
    }
    public void arrancar(){
        if (arrancado) {
            System.out.println("Ya esta arrancado");
        } else {
            this.arrancado = true;
            System.out.println("Arrancando....");
        }
    }
    public void detener(){
        if (arrancado) {
            System.out.println("Deteniendo....");
            this.arrancado = false;
        } else {
            System.out.println("Ya esta detenido");
        }
    }
    public void estaArrancado(){
        if (arrancado) {
            System.out.println("Esta arrancado");
        } else {
            System.out.println("Esta detenido");
        }
    }
    
}
