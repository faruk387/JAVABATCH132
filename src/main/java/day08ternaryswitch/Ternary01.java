package day08ternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {
        //Example 1: Type code to select the minimum one of two integers
        int i1=35;
        int i2=25;
        int result=i1<i2? i1:i2;
        System.out.println(result);
        //Example 2: Type code to calculate absolute value of an integer
        //           5 ==> 5   -   0 ==> 0   -   -5 ==> -1*-5=5
        int a=0;
        int b=a>=0? a:Math.abs(a);// eller a<0? -1*c:c;
        System.out.println(b);
        //Example 3: If two integers are positive return the multiplication
        //           Otherwise, give a message like "I do not know how to multiply"
        //           3 and 4 ==> 12   -   -3 and -4 ==> "I do not know how to multiply"   -  -3 and 4 ==> "I do not know how to multiply"
        int t1=0;
        int t2=12;
        Object t3=t1>0&&t2>0? t1*t2:"It dont know how to multilpy";
        System.out.println(t3);
    }
}
