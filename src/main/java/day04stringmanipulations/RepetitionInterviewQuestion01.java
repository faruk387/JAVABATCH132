package day04stringmanipulations;

public class RepetitionInterviewQuestion01 {
    public static void main(String[] args) {
        int a=12;
        int b=5;
        System.out.println(a);
        System.out.println(b);
        //First way
        int c=b;
        b=a;
        a=c;
        System.out.println(a);
        System.out.println(b);
        //second way
        a=b-a;
        b=b-a;
        a=a+b;
        System.out.println(a);
        System.out.println(b);

    }
}
