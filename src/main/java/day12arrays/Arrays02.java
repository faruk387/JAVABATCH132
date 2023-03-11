package day12arrays;

import java.util.Arrays;

public class Arrays02  {
    public static void main(String[] args) {
        //Example 1: Create an integer array, add 6 elements in it. Find the sum of all elements.
        int ages[]=new int[6];
        System.out.println(Arrays.toString(ages));
        ages[0]=13;
        ages[1]=24;
        ages[2]=12;
        ages[3]=19;
        ages[4]=34;
        ages[5]=21;
        System.out.println(Arrays.toString(ages));
        int sum=0;
        for(int w:ages){
            sum=sum+w;
        }
        System.out.println(sum);
        //Example 2: Create an integer array, type code to find the sum of the min and the max value.
        //           [12, 45, 9, 56] ==> 9+56=65
        int total=0;
        int maxmin[]=new int[4];
        maxmin[0]=12;
        maxmin[1]=45;
        maxmin[2]=9;
        maxmin[3]=56;
        //use sorts
        Arrays.sort(maxmin);
        System.out.println(Arrays.toString(maxmin));
       total=total+maxmin[0]+maxmin[maxmin.length-1];
        System.out.println(total);
        System.out.println(maxmin[0]+maxmin[maxmin.length-1]);
        int num[]=new int[4];
        num[0]=12;
        num[1]=45;
        num[2]=9;
        num[3]=56;
        System.out.println(Arrays.toString(num));
        int minValue=num[0];
        for(int w:num){

           minValue=Math.min(minValue,w);
            }
        System.out.println(minValue);
        int maxValue=num[0];
        for(int w:num){
            maxValue=Math.max(maxValue,w);
        }
        System.out.println(maxValue);
        System.out.println(maxValue+minValue);




    }
}
