package Replit;

import java.util.Scanner;

public class IfQ02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Give a letter");
        String s= input.next();

        switch(s.charAt(0)){
            case 'a':
                System.out.println("your request is being proccessed");
                break;
            case 'b':
                System.out.println("Thank you anyway for your consideration");
                break;
            case 'c':
                System.out.println("the message Sorry, no help is currently available");
                break;
            default:
                System.out.println("Invalid entry, please try again!");
        }
    }
}
