package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner03 {
    //Example 1: Ask user to enter width snd the length of a rectangle, then calculate
//perimeter and the area of the rectangle.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Wisth and Length");
        double width = input.nextDouble();
        double length = input.nextDouble();
        System.out.println("Area is : "+ (width*length));
        System.out.println("Perimeter is : "+ (2*(width+length)));
    }
}
