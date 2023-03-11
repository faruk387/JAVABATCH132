package day11nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop0101 {
    public static void main(String[] args) {
        //Type a code to print int from 4 to 7
        //1.Way-use for loop
        for(int i=4;i<8;i++){
            System.out.print(i+ " ");
        }
        System.out.println();
        int i=4;
        while(i<8){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //Example 2: Type code to print odd integers from 12 to 67 in the same line
        int k=12;
        while(k<68){
            if(k%2!=0){
                System.out.print(k+ " ");
            }
            k++;
        }
        System.out.println();
        //Example 4: Type java code by using while loop,
//           Write a program that prompts the user to input an integer.
//           It should then find the sum of the digits of that number.
//           123 ==> 1+2+3 = 6
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a digit");
        int num= input.nextInt();
        int sum=0;
        num=Math.abs(num);
        while(num>0){
            sum=sum+num%10;

            num/=10;
        }
        System.out.println(sum);
        /*
     Example 5: Type java code by using while loop,
     Write a program that prompts the user to input a number.
     It should then print the multiplication table of that number.
     3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30

         */
        System.out.println("Enter a digit");
        int digit= input.nextInt();

        int z=1;
        while(z<11){
            System.out.println(digit+"x"+z+"="+digit*z);
            z++;
        }
    }
}
