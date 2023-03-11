package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class RepetitionScanner02 {
    public static void main(String[] args) {
        //Example 1: Get shirtPrice and shoePrice from user and
        // print the total price on the console
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the price of shirt...");
        double shirtPrice= input.nextDouble();
        System.out.println("Enter the price of shoe...");
        double shoePrice= input.nextDouble();
        System.out.println("The sum of shirt and shoe prices are: $"+(shirtPrice+shoePrice));
    }
}
