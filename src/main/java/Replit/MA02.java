package Replit;

import java.util.Scanner;

public class MA02 {
    public static void main(String[] args) {

        String s="Coding is greate.";
        String[] s1=s.split("");
        String s2="";
        for(int i=s1.length-1;i>=0;i--){
            s2=s2+s1[i];
        }
        System.out.println(s2);
    }
}
