package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Full Name");
        String fullName=input.nextLine();
        System.out.println("Enter your address");
        String address = input.nextLine();
        System.out.println(fullName+"\n"+address);
    }
}
