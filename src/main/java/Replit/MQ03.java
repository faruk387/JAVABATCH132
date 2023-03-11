package Replit;

import java.util.Arrays;

public class MQ03 {
    public static void main(String[] args) {
sum("245FF");
    }
    public static void sum(String s){

        String s1=s.replaceAll("[^0-9]","");
        String[] s2=s1.split("");
        int sum=0;
        for(int i=0;i<s1.length();i++){
            sum=sum+Integer.valueOf(s2[i]);

        }


        System.out.println(sum);
    }
}
