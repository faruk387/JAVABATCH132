package day04stringmanipulations;

import java.util.Scanner;

public class RepetitionStringManipulations01 {
    public static void main(String[] args) {
        //Example 1: Get the full name of the user and make all characters in upper cases
        Scanner input=new Scanner(System.in);
        System.out.println("What is your full name...");
        String s1= input.nextLine();
        System.out.println(s1.toUpperCase());
        //Example 2: Get the full name of the user, make all characters in upper cases, and remove spaces
        //           from the beginning and from the end
        System.out.println(s1.toUpperCase().trim());
        //Example 3: Get a String from a user, then count the number of characters in the String
        System.out.println(s1.length());
    }
}
