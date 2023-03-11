package day07ifstatementsternarystatements;

import java.util.Scanner;

public class NestedIfStatement01 {
    //Nested Structures use too much time in execution, it makes the application slow that is why we do not like
    //to use nested structures, but sometimes it is being mandatory to use that is why we are learning.

    //If a code has much execution time, it is called "Time consuming code". Prevent to type time-consuming codes.
    public static void main(String[] args) {
        //Example 1: If the worker is male and the age is greater than 65 he will be retired otherwise he should work.
        //           If the worker is female and the age is greater than 60 he will be retired otherwise she should work.
        //           If the worker does not define himself as male or female print "Undefined" on the console
        //
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your gender like Male,Female,or Others");
        String gender= input.next();
        System.out.println("Enter your age");
        byte age= input.nextByte();
        if(gender.equalsIgnoreCase("Male")){
            if(age<0){
                System.out.println("Invalid age");
            }else if(age<66){
                System.out.println("You should wok");
            }
            else{
                System.out.println("You are retired");
            }
            }else if(gender.equalsIgnoreCase("Female")) {
            if (age < 0) {
                System.out.println("Invalid age");
            } else if (age < 61) {
                System.out.println("You should wok");
            } else {
                System.out.println("You are retired");
            }
        }else{
            System.out.println("Undefined");
        }
        }


}
