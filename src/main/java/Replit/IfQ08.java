package Replit;

import java.util.Scanner;

public class IfQ08 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a name");
        String name1= input.next();
        String s1=name1.substring(name1.length()-2,name1.length());
        System.out.println(s1+s1+s1);
    }
}
