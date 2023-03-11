package day11nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args) {
        //What is the difference between while and do while?
        //While Loop:Zero execution possible
        int i=1;
        while(i<1){
            System.out.println("i am while loop");
            i++;
        }
        //do while loop:zero execution is not possible
        int k=1;
        do {
            System.out.println("i am do while loop");
            k++;
        }while (k < 1);

/*
      Ask user to enter an integer.
      If the integer is less than 100, tell user "Won!"
      Otherwise, tell user "Lost!"
 */
        Scanner input=new Scanner(System.in);

        do{
            System.out.println("Enter an integer to win...");
            int num= input.nextInt();
            if(num<100){
                System.out.println("You won");
            }else{
                System.out.println("You lost");
                break;
            }

        }while(true);


    }
}
