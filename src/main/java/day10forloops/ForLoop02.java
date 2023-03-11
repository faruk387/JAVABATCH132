package day10forloops;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
        //Example 1: Type code to find the sum of the "unique digits" in an Integer
        //           123214 ==> 3+4=7
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer");
        String num = input.next();
        int sumOfUniques = 0;
        for (int i = 0; i < num.length(); i++) {
            String ch = num.substring(i, i + 1);
            if (num.indexOf(ch) == num.lastIndexOf(ch)) {
                sumOfUniques = sumOfUniques + Integer.valueOf(ch);
                //If you put "char" data type inside the "valueOf()" method, it gives you the ASCII value of the char
                //If you use "non-digit" characters in "valueOf()" method, it gives error
            }
            System.out.println(sumOfUniques);

        }
    }
}
