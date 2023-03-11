package Replit;

import java.util.Scanner;

public class ForQ09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a digit");
        int a= input.nextInt();
        String s= String.valueOf(a);
        String sReverse="";
        for(int i=s.length()-1;i>=0;i--){
            sReverse=sReverse+s.charAt(i);
        }
        System.out.println(sReverse);
    }
}
