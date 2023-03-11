package Replit;

import java.util.Scanner;

public class ForQ02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 2 number");
       int i1= input.nextInt();
       int i2= input.nextInt();
       int gcd=0;
       for(int i=1;i<i1||i<i2;i++){
           if(i1%i==0&&i2%i==0){
             gcd=i;
           }
       }
        System.out.println("GCD for " +i1+" and "+i2+" = "+gcd);
       int lcm=(i1*i2)/gcd;
        System.out.println("LCM for " +i1+" and "+i2+" = "+lcm);
           }
}
