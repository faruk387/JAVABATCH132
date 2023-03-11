package Replit;

import java.util.Arrays;

public class ListQ05 {
    public static void main(String[] args) {
        int a=5;
        int counter=0;
        Integer[] b= new Integer[10];
        for(int i=a;a<20;i++){
            for(int k=2;k<a;i++){
                if(i%k!=0){

             b[counter]=i;
             counter++;

                }
                System.out.println(Arrays.toString(b));
            }

        }
    }
}
