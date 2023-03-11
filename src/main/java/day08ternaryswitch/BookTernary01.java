package day08ternaryswitch;

public class BookTernary01 {
    public static void main(String[] args) {
        /*
        Use ternary to print "Valid Password" if the password has at least 8 characters different
from space characters. "Invalid Password" if the password has less than 8 characters
different from space character
         */
        String s="abdswel ";
       String s1= s.replace(" ","").length()>7?"Valid pass":"Invalid pass";
        System.out.println(s1);

        /*
        Use ternary to print
a) "Isosceles Triangle" if two sides of a triangle are equal in length.
b) "Equilateral Triangle" if all sides of a triangle are equal in length.
c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied
         */
        int a=5;
        int b=4;
        int c=2;
       String triangle= a==b&& b==c?"Egu Triangle":(a==b&&b!=c || a==c&& b!=c|| b==c&& a!=c?"is triangle":"neither");
        System.out.println(triangle);

    }
}
