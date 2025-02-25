package Personas;

public class TestPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona(null, 0, 0);
        Persona p2 = new Persona("8347523B", 180, 17);
        System.out.println(p1);
        System.out.println(p2);
        Ingeniero i1 = new Ingeniero("3274932U", 180,29,"Llave Inglesa");
        System.out.println(i1);
    }
}
