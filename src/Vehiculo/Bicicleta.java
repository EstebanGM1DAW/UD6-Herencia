package Vehiculo;

public class Bicicleta extends Vehiculo{
    int kilometrosRecorridos;
    public Bicicleta(int kmReco) {
        this.kilometrosRecorridos = kmReco;
        kilometrosTotales += kmReco;
        vehiculosCreados++;
    }
    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
    @Override
    public String toString() {
        return "KilometrosRecorridos:" + kilometrosRecorridos;
    }
    public void caballito(){
        System.out.println("🚲 Haciendo caballito....");
    }
    public void andarBici(int km){
        kilometrosRecorridos+=km;
        kilometrosTotales+=km;
    }


}
