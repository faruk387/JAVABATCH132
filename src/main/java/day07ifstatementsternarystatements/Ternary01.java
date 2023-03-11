package day07ifstatementsternarystatements;

import org.w3c.dom.ls.LSOutput;

public class Ternary01 {
    public static void main(String[] args) {
        //Example 1: Type a code to check if a number is even by ternary
        //First way= use if else
        int num = 7;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");
        }
        //2. Way:Ternary
        //              Condition ? The code will be executed :  The code will be executed
        //                          for true condition        :  for false condition
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println(result);

        // Example 2: Type code to check if a number has 3 digits or not,use ternary.
        int b = 1205;
        b= Math.abs(b);
        String result1 = b>99 && b<1000 ? "3 digit" : "not 3 digit";
        System.out.println(result1);
    }
}
