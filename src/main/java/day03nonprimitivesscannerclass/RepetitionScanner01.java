package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class RepetitionScanner01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age...");
        int age= input.nextInt();
        System.out.println("Your age is: "+age);
    }
}
