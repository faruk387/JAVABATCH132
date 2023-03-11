package day12arrays;

import java.util.Arrays;

public class BookArrays02 {
    public static void main(String[] args) {
        int[] num={-12,18,-5,23,-2};
        Arrays.sort(num);
        int minPositive=num[num.length-1];
        int maxNegative=num[0];
        for(int w:num){
            if(w<0){
                maxNegative= Math.max(maxNegative,w);

            }else if(w>=0){
                minPositive= Math.min(minPositive,w);
            }
        }
        System.out.println(minPositive);
        System.out.println(maxNegative);
        for(int i=0;i< num.length;i++){
            if(num[i]<0&&num[i+1]>=0){
                System.out.println(num[i]);
                System.out.println(num[i+1]);
            }
        }
    }
}
