package b132practices.practice03;

import java.util.Scanner;

public class Q02Switch {
    public static void main(String[] args) {
        //Ask user to enter a character, if it is vowel print 'Vowel 'or if it is not vowel 'Not Vowel'
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a letter to check if it is vowel or not");
        char ch=input.next().toLowerCase().charAt(0);
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
             System.out.println("it is a vowel");
             break;
            case 'b':
            case 'c':
            case 'd':
            case 'r':
            case 't':
            case 'y':
            case 'p':
            case 'l':
            case 'k':
            case 'm':
                System.out.println("not a vowel");
                break;
            default:
                System.out.println("enter a letter");


        }



    }
}
