package Replit;

import java.util.Scanner;

public class IfQ06 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a name with 3 characters");
        String s= input.next();
        System.out.println(s.length()==3?(s.charAt(0)!=s.charAt(1)&&s.charAt(1)!=s.charAt(2)&&s.charAt(0)!=s.charAt(2)?"String has unique characters": "String has duplicate characters" ):(s.length()>3?"Name has more then 3 character":"Name has less then 3 character"));
    }
}
