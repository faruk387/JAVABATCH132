package Replit;

public class ForQ07 {
    public static void main(String[] args) {
        int a=6;
        int sum=0;

        for(int i=a-1;i>=1;i--){
            if(a%i==0){
                sum=sum+i;
            }

        }
        if(sum==a){
            System.out.println(a+" is perfect number");

        }else{
            System.out.println(a+" is not perfect number");
        }


    }
}