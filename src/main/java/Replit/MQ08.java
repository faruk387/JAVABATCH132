package Replit;

import java.util.Arrays;
import java.util.Collections;

public class MQ08 {
    public static void main(String[] args) {
        Integer[] a={1,2,3,4};
        Integer[] b={5,6};

        arrayAdd(a,b);
    }
    public static void arrayAdd(Integer[] a,Integer[]b){
        Integer[] c=new Integer[a.length+ b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];

        }
        for(int i=a.length;i<a.length+b.length;i++){
            int index=0;
            c[i]=b[i-a.length];
            index++;


        }
        System.out.println(Arrays.toString(c));






        }

}
