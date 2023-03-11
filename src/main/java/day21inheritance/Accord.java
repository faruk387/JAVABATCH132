package day21inheritance;

public class Accord extends Honda{
    public void turboSystem(){
        System.out.println("Using Accord is exciting");
    }

    public Accord() {
        super();
        System.out.println("Accord Constructor...");
    }
}
