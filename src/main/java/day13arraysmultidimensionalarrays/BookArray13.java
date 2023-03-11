package day13arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class BookArray13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 2 string to see if they are anagram");
        String s1= input.next();
        String s2= input.next();
        String[] a1=s1.toLowerCase().split("");
        String[] a2=s2.toLowerCase().split("");
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1,a2)){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }
    }
}
