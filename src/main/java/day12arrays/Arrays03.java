package day12arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Example 1: Create a String array with 5 elements, delete the elements whose length is less than 5
        //           [Orange, Blue, Red, Yellow, Brown] ==> [Orange, Yellow, Brown]
        String s[]=new String[5];
        s[0]="Orange";
        s[1]="Blue";
        s[2]="Red";
        s[3]="Yellow";
        s[4]="Brown";
        //How many greater then 5 char
        int counter=0;

        for(String w:s){
            if(w.length()>=5){
                counter++;

            }

        }
        String newArray[]=new String[counter];
        int idx=0;
        System.out.println(counter);
        for(String w:s){
            if(w.length()>=5){

        newArray[idx]=w;
                idx++;

            }

        }
        System.out.println(Arrays.toString(newArray));

    }
}
