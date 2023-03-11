package Replit;

import java.util.Scanner;

/*
* Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)


(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

Input :

John White 1234234534561478

Output :

Name : J*** W****

CCN  : **** **** **** 1478

 */
public class IfQ04 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Write your name");
        String name= input.next();
        name=name.substring(0,1).toUpperCase()+name.substring(1,name.length()).toLowerCase();
        System.out.println("Write your surname");
        String surName= input.next();
        surName=surName.substring(0,1).toUpperCase()+surName.substring(1,surName.length()).toLowerCase();;
        System.out.println("Enter your CCN number");
        String CCN= input.next();

       String ccn=CCN.replaceAll("....", "$0 ");
        if(ccn.length()!=16){
            System.out.println("invalid credit card number");

        }

        System.out.println("Name: "+name+" "+surName);
        System.out.println("CCN: "+ccn);



    }
}
