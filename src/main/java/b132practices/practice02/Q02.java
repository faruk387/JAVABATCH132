package b132practices.practice02;

import java.util.Scanner;

public class Q02 {
    /*
    Modulus Operator==>in Java % is called modulus operator
    It returns the "remainder" in a division operation
    13/5 ==>3 ==> 13%5 ==> 3
     */
    public static void main(String[] args) {
        //Ask user to enter an integer then print "Even" on the console if the number is even.
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer");
        int a= input.nextInt();
        boolean a1=a%2==0;
      System.out.println("Is the number even? "+a1);
        //Check a number if it is odd or not
        boolean a2=a%2!=0;
        System.out.println("Is the number odd? "+a2);

    }

}
