package b132practices.practice01;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Write a Java program to break an integer into a sequence of individual digits.
        // Hint: use / and %
        // x: input: 12345
        //    output: 1
        //            2
        //            3
        //           4
        //            5
        Scanner input= new Scanner(System.in);
        System.out.println("give me the number");
        int number = input.nextInt();
        System.out.println(number/10000+"\n"+(number/1000)%10+ "\n"+(number/100)%10+ "\n"+ (number/10)%10+"\n"+ number%10 );
    }
}
