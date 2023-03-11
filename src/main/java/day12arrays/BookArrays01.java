package day12arrays;

import java.util.Arrays;

public class BookArrays01 {
    public static void main(String[] args) {
        /*
        Find the middle element in an integer array
Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
 (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 1
         */
int[] num={12,5,8,13};
        Arrays.sort(num);
int mid=0;

if(num.length%2!=0){
    mid=mid+num[num.length/2];
    System.out.println(mid);
}else{
    mid=mid+(num[num.length/2]+num[num.length/2-1])/2;
    System.out.println(mid);
}

    }
}
