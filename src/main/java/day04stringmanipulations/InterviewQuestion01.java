package day04stringmanipulations;

public class InterviewQuestion01 {
    public static void main(String[] args) {
        //Example 1: Type to swap the integers
        //           a=12 and b=5 ==> a=5 and b=12
        //1.way
        int a=12;
        int b=5;
        int c=0;
        c=b;
        b=a;
        a=c;
        System.out.println(a);
        System.out.println(b);
        //2. way
        a=b+a;//5
        b=a-b;//5
        a=a-b;
        System.out.println(a);
        System.out.println(b);




    }
}
