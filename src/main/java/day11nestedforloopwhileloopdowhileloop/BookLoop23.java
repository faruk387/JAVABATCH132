package day11nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class BookLoop23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a digit");
        int number= input.nextInt();
        int counter=0;
        if(number==1){
            System.out.println("number is prime number");
        }else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                    counter++;
                }
            }
            if(counter==0){
                System.out.println("is prime");
            }else{
                System.out.println("is not prime");
            }
        }

    }
}
