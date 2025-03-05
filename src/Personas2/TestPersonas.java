package Personas2;

public class TestPersonas {
    public static void main(String[] args) {
        Profesor pf1 = new Profesor("Mario", 39, "Fol", 4);
        pf1.mostrar();
        System.out.println("__________________________");
        Alumno al1 = new Alumno("Pedro", 17, "2ºSMR", 4.6);
        al1.mostrar();
    }
}
