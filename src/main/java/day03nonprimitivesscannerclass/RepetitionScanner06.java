package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class RepetitionScanner06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name...");
        String firstName= input.nextLine();
        System.out.println("Enter your last name...");
        String lastName= input.nextLine();
        System.out.println("First name is : "+firstName+"\n"+"Last name is: "+lastName);
    }
}
