package Replit;

public class ForQ04 {
    public static void main(String[] args) {
        int a=6;
        int b=1;
        String s="";
        for(int i=a-1;i>0;i--){
           b=b*i;
            s=s+i+"*";
        }
       s=s.substring(0,s.length()-1);
        System.out.println(a+"!"+"= "+s+"= "+b);
    }

}
