package day03nonprimitivesscannerclass;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RepetitionScanner03 {
    //Example 1: Ask user to enter width snd the length of a rectangle, then calculate
//perimeter and the area of the rectangle.


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the width and length of a rectangle:");
        double width= input.nextDouble();
        double length= input.nextDouble();
        System.out.println("The area of the rectangle is: "+width*length);
        System.out.println("The perimeter of the rectangle is: "+(2*(width+length)));




    }
}
