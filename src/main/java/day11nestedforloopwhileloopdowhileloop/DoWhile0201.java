package day11nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class DoWhile0201 {
      /*
         Username is "admin", Password is "pwd123"
         Ask user to enter username and password
         User should see "Enter your username and password" message
         If he enters correct credentials he should get "You are in your account!" message
         Otherwise, he should see "Enter your username and password" message 3 times
         After 3 times he should get "Your account is blocked" message

*/
      public static void main(String[] args) {


    Scanner input= new Scanner(System.in);
          int counter=0;
    do{


        if(counter==3){
            System.out.println("your account is blocked");
        }
        System.out.println("Enter user name");
        String u= input.next();
        System.out.println("Enter password");
        String p= input.next();
        if(u.equals("admin")&&p.equals("pwd123")){
            System.out.println("you are in your account");
        }else{
            System.out.println("You are not in your account");
            counter++;
        }

    }while(true);
      }
}
