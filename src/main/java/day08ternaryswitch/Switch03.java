package day08ternaryswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Example 1: Create a simple calculator which does addition, subtraction, multiplication, division, percentage calculation
        Scanner input=new Scanner(System.in);
        System.out.println("Write to integer");
        double a= input.nextDouble();
        double b= input.nextDouble();
        System.out.println("Write +/-* to calculate");
        char c= input.next().charAt(0);
        switch(c){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Undefined parameter");
        }

    }
}
