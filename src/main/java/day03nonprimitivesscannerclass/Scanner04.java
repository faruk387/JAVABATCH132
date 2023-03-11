package day03nonprimitivesscannerclass;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
   Type a program which calculates the volume of a rectangular prism
   whose length, width, and height are entered by user.
   Hint 1: Volume of a rectangular prism is width x length x height
*/
        System.out.println("Enter Width, Length and Height");
        double width = input.nextDouble();
        double length = input.nextDouble();
        double height = input.nextDouble();

        System.out.println("Volume is : "+ (width*length*height));

    }
}
