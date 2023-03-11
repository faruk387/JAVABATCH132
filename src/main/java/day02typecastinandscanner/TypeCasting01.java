package day02typecastinandscanner;

public class TypeCasting01 {
    public static void main(String[] args) {
        int a= 5;
        int b= 10;
        String s= "Faruk";
        System.out.println(a+b+s);
        System.out.println(s+a+b);

        //Type Casting
        //Auto Widening
        int m= 45;
        System.out.println(m);
        double d = m;
        System.out.println(d);
        //Explicit narrowing
        int i = 20;
        System.out.println(i);
        byte c = (byte)i;
        System.out.println(c);
    }
}
