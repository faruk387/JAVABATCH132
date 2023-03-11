package day13arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class BookArrays12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int length= input.nextInt();
        int[] arr=new int[length];
        int c=0;
        System.out.println("Enter"+length+"array elements");
        for(int i=0;i<length;i++){
            arr[i]= input.nextInt();

        }
        Arrays.sort(arr);
        c=arr[arr.length-1]-arr[0];
        System.out.println(c);

    }
}
