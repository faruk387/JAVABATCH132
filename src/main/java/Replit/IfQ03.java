package Replit;

import java.util.Scanner;

public class IfQ03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 2 integer");
        int a= input.nextInt();
        int b= input.nextInt();
        if(a+b>1000000000){
            System.out.println("overflow");
        }else{
            System.out.println("sum of the numbers "+(a+b));
        }


    }

}
