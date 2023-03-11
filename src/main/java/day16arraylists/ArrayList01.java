package day16arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        //Example 1: Find two closest integer in a given list
        //           [12, 15, 10, 14] ==> 15 and 14

        List<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(15);
        nums.add(10);
        nums.add(14);
        Collections.sort(nums);
        System.out.println(nums);
        int minDiff= nums.get(1)- nums.get(0);
        for(int i=1;i< nums.size();i++){
            minDiff=Math.min(minDiff, nums.get(i)- nums.get(i-1));
        }
        System.out.println(minDiff);
        for(int i=1;i<nums.size();i++){
            if(nums.get(i)- nums.get(i-1)==minDiff){
                System.out.println(nums.get(i-1)+" and "+ nums.get(i));


            }
        }
    }
}
