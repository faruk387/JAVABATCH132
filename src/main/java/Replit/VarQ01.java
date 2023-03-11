package Replit;

public class VarQ01 {
    public static void main(String[] args) {
        sum(1,2,3);
    }
    public static void sum(int...a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
