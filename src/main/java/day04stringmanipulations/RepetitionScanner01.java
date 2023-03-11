package day04stringmanipulations;

import java.util.Scanner;

public class RepetitionScanner01 {
    public static void main(String[] args) {
        //Example 1: Get the initials of a name which contains first name and last name
        //           Tom Hanks ==> TH
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name...");
        String fullName= input.nextLine();
        char i1= fullName.charAt(0);
        char i2=fullName.split(" ")[1].charAt(0);
        System.out.println(i1+"-"+i2);
    }
}
