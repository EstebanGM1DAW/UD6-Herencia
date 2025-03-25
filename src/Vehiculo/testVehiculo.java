package Vehiculo;

import java.util.Scanner;

public class testVehiculo {
    public static void main(String[] args) {
        int menu = 9;
        Scanner entrada = new Scanner(System.in);
        Coche c1 = new Coche(20000);
        Bicicleta b1 = new Bicicleta(30000);
        do {
            System.out.println("***********************");
        System.out.println("1.Anda con la bicicleta");
        System.out.println("2.Haz el caballito con la bici");
        System.out.println("3.Anda con el coche");
        System.out.println("4.Quema rueda con el coche");
        System.out.println("5.Ver kilometraje de la bici");
        System.out.println("6.Ver kilometraje del coche");
        System.out.println("7.Ver kilometros total");
        System.out.println("8.Arrancar el coche");
        System.out.println("9.Detener el coche");
        System.out.println("10.salir");
        System.out.println("*******************************");
        menu = entrada.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Cuantos kilometros quieres añadir?");
                    int km = entrada.nextInt();
                    b1.andarBici(km);    
                    break;
                case 2:
                    b1.caballito();
                    break;
                case 3:
                    System.out.println("Cuantos kilometros quieres añadir?");
                    km = entrada.nextInt();
                    c1.andarCoche(km);
                    break;
                case 4:
                    c1.quemarRueda();
                    break;
                case 5:
                    System.out.println(b1);                    
                    break;
                case 6:
                    System.out.println(c1);                    
                    break;
                case 7:
                    System.out.println(Vehiculo.getKilometrosTotales());
                    break;
                case 8:
                    c1.arrancar();
                    break;
                case 9:
                    c1.detener();
                    break;
                default:
                    break;
            }
        } while (menu != 10);
        entrada.close();
    }
}
