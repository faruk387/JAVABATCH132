package Replit;

import java.util.Scanner;

public class ForQ01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a name");
        String name1= input.nextLine();
        System.out.println("Enter a character");
       String ch= input.next();
       int counter=0;
      char ch1=ch.charAt(0);
      for(int i=0;i<name1.length()-1;i++){
          if(name1.charAt(i)==ch1){
              counter++;

          }



      }
        System.out.println("Number of "+ch1+"="+counter);

    }
}
