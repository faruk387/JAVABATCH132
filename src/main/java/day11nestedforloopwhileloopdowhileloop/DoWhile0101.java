package day11nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class DoWhile0101 {
    public static void main(String[] args) {
        /*
      Ask user to enter an integer.
      If the integer is less than 100, tell user "Won!"
      Otherwise, tell user "Lost!"
 */
        Scanner input=new Scanner(System.in);

        do{
            System.out.println("Enter a digit to won...");
            int num= input.nextInt();
            if(num<100){
                System.out.println("You won");
            }else{
                System.out.println("you loss");
                break;
            }


        }while(true);
    }
}
