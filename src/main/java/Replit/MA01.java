package Replit;

public class MA01 {
    public static void main(String[] args) {
        reverse(1234);
    }
    public static void reverse(int a){
        String s=String.valueOf(a);
        String sReverse="";
        for(int i=s.length()-1;i>=0;i--){
            sReverse=sReverse+s.charAt(i);

        }
        System.out.println(sReverse);

    }

}
