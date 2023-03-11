package Replit;

import java.util.Arrays;

public class MQ04 {
    public static void main(String[] args) {
        char1("Faruk");

    }
    public static void char1(String s){

        Character[] char3=new Character[s.length()];
        for(int i=0;i<s.length();i++){
           char3[i]=s.charAt(i);
        }
        System.out.println(Arrays.toString(char3));
    }
}
