package Replit;

public class SBQ01 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("I love java");
        System.out.println(s);
        StringBuilder s1 = new StringBuilder(s.reverse());
        System.out.println(s1);
        String s2=s.toString();
        System.out.println(s2);
        String s3=s1.toString();
        System.out.println(s3);
        int counter=0;
        for(int i=0;i<s.length();i++){

            if(s2.charAt(i)!=s3.charAt(i)){
               counter++;
            }

        }
        if(counter==0){
            System.out.println("polindrome");
        }else{
            System.out.println("not polindrome");
        }
        System.out.println(counter);
    }
}
