package Replit;

import java.util.Scanner;

public class IfQ05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the year");
        int year= input.nextInt();
        System.out.println("Enter month number");
        int month= input.nextInt();
       String b1= year%100==0?(year%400==0?"Year is leap":"Year is not leap"):(year%4==0?"Year is leap":"Year is not leap");

       switch(month){

           case 1:
               System.out.println("January "+year+" has 31 days");
               break;
           case 2:
               if(b1.equalsIgnoreCase("Year is leap")){
                   System.out.println("February "+year+" has 29 days");
                   break;
               }

             else{
                   System.out.println("February "+year+" has 28 days");
break;
               }


           case 3:
               System.out.println("March "+year+" has 31 days");
               break;
           case 4:
               System.out.println("April "+year+" has 31 days");
               break;
           case 5:
               System.out.println("May "+year+" has 31 days");
               break;
           case 6:
               System.out.println("Jun "+year+" has 31 days");
               break;
           case 7:
               System.out.println("July "+year+" has 31 days");
               break;
           case 8:
               System.out.println("August "+year+" has 31 days");
               break;
           case 9:
               System.out.println("September "+year+" has 30 days");
               break;
           case 10:
               System.out.println("October "+year+" has 31 days");
               break;
           case 11:
               System.out.println("November "+year+" has 30 days");
               break;
           case 12:
               System.out.println("December "+year+" has 31 days");
               break;
           default:
               System.out.println("invalid year or month");
       }




    }
}
