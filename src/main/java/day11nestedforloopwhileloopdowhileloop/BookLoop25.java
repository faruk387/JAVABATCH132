package day11nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class BookLoop25 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a digit to check if it is armstrong");
        int n= input.nextInt();
        int sumOfCubes=0;
        int temp=n;
        int digit=0;
        while(n>0){
            digit=n%10;
            sumOfCubes=sumOfCubes+digit*digit*digit;
            n=n/10;
        }
        if(temp==sumOfCubes){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}
