package day02typecastinandscanner;

public class WrapperClass01 {
    public static void main(String[] args) {
        int age = 13;
        Integer name = age;
        float numberf =name.floatValue();
        System.out.println(numberf);
        int name1 = name.byteValue();
        System.out.println(name1);

        //Autoboxing
        char c ='A';
        Character c1= c;
        //Unboxing
        Short s = 15;
        short s1 = s;

    }
}
