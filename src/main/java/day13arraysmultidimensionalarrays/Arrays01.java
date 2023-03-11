package day13arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Example 1: Create an integer array and print elements less than 10 on the console.
        int ages[] = new int[7];
        ages[0] = 13;
        ages[1] = 6;
        ages[2] = 19;
        ages[3] = -8;
        ages[4] = 10;
        ages[5] = 2;
        ages[6] = 87;


        for(int w:ages){
            if(w<10){
                System.out.print(w+" ");

            }
        }
        //2. way
        System.out.println();
        Arrays.sort(ages);
        for(int w:ages){
            if(w>=10){
                break;
            }else{
                System.out.print(w+" ");
            }
        }
        //Example 2: Create an integer array and print elements greater than 10 on the console.
        int nums[] = new int[7];
        nums[0] = 13;
        nums[1] = 6;
        nums[2] = 19;
        nums[3] = -8;
        nums[4] = 10;
        nums[5] = 2;
        nums[6] = 87;

        System.out.println();
        //first way
        for(int w:nums){
            if(w>10){
                System.out.print(w+" ");
            }
        }
        System.out.println();
        //2. way
        Arrays.sort(nums);
       for(int i= nums.length-1;i>=0;i--){
           if(nums[i]<=10){
               break;

           }else{
               System.out.print(nums[i]+" ");
           }
       }
       //3. way
        System.out.println();
        for(int w:nums){
            if(w<=10){
                continue;
            }else{
                System.out.print(w+" ");
            }
        }

    }
}
