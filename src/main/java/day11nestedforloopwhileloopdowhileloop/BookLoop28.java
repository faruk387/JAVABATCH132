package day11nestedforloopwhileloopdowhileloop;

import java.util.Scanner;

public class BookLoop28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer");
        int n= input.nextInt();
        if(n<=1){
            System.out.println("false");
        }
        for(int i=2;i<n;i++){
            if(n%i==0){

            }
            System.out.println(i);
        }
    }
}
