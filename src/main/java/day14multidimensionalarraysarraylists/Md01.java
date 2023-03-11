package day14multidimensionalarraysarraylists;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //Example 1: Convert 2 dimensional array to 1 dimensional array
        //          [ [5,3], [9,8,7] ] ==> [5,3,9,8,7]

        //1. Step: Find the number of elements in the multidimensional array
        int[][] a={{5,3},{9,8,7}};
        int sum=0;
        for(int[] w:a){
         sum=sum+ w.length;


        }
        System.out.println(sum);
        //Crerate new 1 dimensional array whose length is the same
        int [] b=new int[sum];
        int i=0;
        //Transfer the elements
       for(int[]w:a){
           for(int k:w){
               b[i]=k;
               i++;
           }


       }
        System.out.println(Arrays.toString(b));
    }
}
