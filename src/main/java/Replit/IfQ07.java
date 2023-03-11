package Replit;

import java.util.Scanner;

public class IfQ07 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 2 name");
        String name1= input.next();
        String name2= input.next();
        if(name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2)+name2+name1.substring(name1.length()/2,name1.length()));

        }else{
            System.out.println("Name 2 can not be inserted Name 1");
        }

    }

}
