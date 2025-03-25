package Vehiculo;

abstract class Vehiculo {
    static int vehiculosCreados = 0;
    static int kilometrosTotales = 0;
    public int getVehiculosCreados() {
        return vehiculosCreados;
    }
    static public int getKilometrosTotales() {
        return kilometrosTotales;
    }
}
