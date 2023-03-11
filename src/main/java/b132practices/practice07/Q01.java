package b132practices.practice07;

import java.util.Scanner;

//Ask user to enter 2 chars and print on console the chars between them.
public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 char");
        char c1 = input.next().charAt(0);
        char c2 = input.next().charAt(0);
        String d="";
        if (c2 > c1) {
            for (int i = c1+1; i < c2; i++) {
                System.out.println((char)i+"");
            }

        }else{
            for (int i = c2+1; i < c1; i++) {
                System.out.println((char)i+"");
            }

        }
    }
}
