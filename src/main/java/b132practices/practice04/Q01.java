package b132practices.practice04;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //Type a code to print its season after getting a month from the user
        Scanner input=new Scanner(System.in);
        System.out.println("Write a month name to learn which season");
        String month= input.next().toLowerCase();
        switch(month){
            case "december":
            case "january":
            case "february" :
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may" :
                System.out.println("Spring");
                break;
            case "june":
            case "july":
            case "august" :
                System.out.println("Summer");
                break;
            case "september":
            case "october":
            case "november" :
                System.out.println("Fall");
                break;
            default:
                System.out.println("it was wrong");


        }
    }
}
