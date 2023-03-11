package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Type a program which calculates the area and the perimeter of a circle
        whose radius is entered by user. (Use float)
        Hint 1: Take pi number as 3.14159
        Hint 2: Area of a circle is 3.14159 x radius x radius
        Hint 3: Perimeter of a circle is 2 x 3.14159 x radius

 */
        System.out.println("Write a radius");
        float radius = input.nextFloat();
        System.out.println("Are of Circle is : "+ (3.14159*radius*radius));
        System.out.println("Perimeter of the Circle is : "+(2*3.14159*radius));
    }
}
