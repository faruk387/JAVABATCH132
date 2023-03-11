package day13arraysmultidimensionalarrays;

import java.util.Arrays;

public class BookArrays11 {
    public static void main(String[] args) {
        int[] arr={5,0,2,0,3};
        int[] brr=new int[arr.length];
        int idx=0;
        int lastidx= arr.length-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                brr[idx]=arr[i];
                idx++;
            }else{
                brr[lastidx]=arr[i];
                lastidx--;
            }
        }
        System.out.println(Arrays.toString(brr));

    }
}
