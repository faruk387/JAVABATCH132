package day07ifstatementsternarystatements;

public class Ternary0101 {
    public static void main(String[] args) {
        //Example 1: Type a code to check if a number is even by ternary
        int i=3014;
        String result=i%2==0? "Even":"Not even";
        System.out.println(result);
        // Example 2: Type code to check if a number has 3 digits or not,use ternary.
        String result1=i>99&&i<1000?"3 digits":"not 3 digit";
        System.out.println(result1);
    }
}
