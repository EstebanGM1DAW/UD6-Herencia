package Yogur;
public class Yogur {
    static double cal;
    public Yogur(){
     this.cal = 120.5;
    }
    public double getCal() {
        return cal;
    }
    @Override
    public String toString() {
        return "Yogur: " + cal;
    }

}
