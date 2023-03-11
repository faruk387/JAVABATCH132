package day08ternaryswitch;

public class BookTernary03 {
    public static void main(String[] args) {
        //Example 2: Type code to calculate absolute value of an integer
        //           5 ==> 5   -   0 ==> 0   -   -5 ==> -1*-5=5
        int a=0;
        int b=a>=0? a:Math.abs(a);// eller a<0? -1*c:c;
        System.out.println(b);

        //Write a program to print the minimum of 2 integers on the console by using ternary
        int i = 13, k = 12;
        int result = i<k ? i : k;
        System.out.println(result);
       //If the number has 3 digits, the output will be “This number has 3 digits.” Otherwise, the
        //output will be “This number has no 3 digits.
        int l = 750;
        String r = (l>99 && i<1000) || (l>-1000 && l<-99) ? "Has 3 digits" : "Has no 3 digits";
        System.out.println(r);
        int l1 = -750;
        l1 = Math.abs(l1);
        String r1 = (l1>99 && l1<1000) ? "Has 3 digits" : "Has no 3 digits";
        System.out.println(r1);


    }
}
