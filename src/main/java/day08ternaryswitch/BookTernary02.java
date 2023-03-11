package day08ternaryswitch;

public class BookTernary02 {
    public static void main(String[] args) {
        /*
        Use ternary to print
a) "Round up by last digit" and print the rounded value if the last digit of an integer is greater than or equal to 5
b) "Round down by last digit" and print the rounded value if the last digit of an integer is less
than 5
 For example; 127 will be rounded up and the value will be 130
 125 will be rounded up and the value will be 130
 123 will be rounded down and the value will be 120
         */
        int a=123;
        int a1=a%10<5? a-a%10:a+(10-a%10);
        System.out.println(a1);
        /*
        Type Apex code by using nested ternary.
 Write a program to check if a year is a leap year or not.
 If the year is divisible by 100 then it must be divisible by 400.
 If a year is not divisible by 100 then it must be divisible by 4
         */
        int year=2300;
        String s=year%100==0? (year%4==0? "year is leap":"year is not leap"):(year%4==0? "year is leap":"year is not leap");
        System.out.println(s);
         /*
            Type code to check the password
            If it has more than 8 characters, initial should be 'i'
            If it has no more than 8 characters initial should be 'K'
            Solve the task by using nested-ternary
        */
        String b="iandm2232";
        String b1= b.length()>8?(b.charAt(0)=='i'? "Right password":"wrong password"):(b.charAt(0)=='K'? "Right password":"Wrong password");
        System.out.println(b1);

    }

}
