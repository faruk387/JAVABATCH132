package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //Example 1: Get shirtPrice and shoePrice from user and
        // print the total price on the console
        Scanner input = new Scanner(System.in);
        System.out.println("Shirt Price");
        double shirt = input.nextDouble();
        System.out.println("Shoes price");
        double shoes= input.nextDouble();
        System.out.println("Total Price is  $"+(shirt+shoes));
    }
}
