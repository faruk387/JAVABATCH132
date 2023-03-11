package Replit;

public class MQ07 {
    public static void main(String[] args) {
       Integer[] a={1,2,3,4,5,6,7,8};
       arraysum(a);
    }
    public static void arraysum(Integer[]a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);

    }
}
