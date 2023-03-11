package day08ternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
            Type java code by using nested ternary.
            Write a program to check if a year is "leap year" or not.
            i)If the year is divisible by 100 then it must be divisible by 400.==>1600+   1800-
            ii)If a year is not divisible by 100 then it must be divisible by 4.==>2004+  1997-
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
        String a="iandm2232";
       String a1= a.length()>8?(a.charAt(0)=='i'? "Right password":"wrong password"):(a.charAt(0)=='K'? "Right password":"Wrong password");
        System.out.println(a1);

    }
}
