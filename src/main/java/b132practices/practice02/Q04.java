package b132practices.practice02;

public class Q04 {
    public static void main(String[] args) {
         /*
        Create a String variable and find the sum of ASCII values of the first and the last characters of the String.
        String s= "Miami";
         */
        String s="Miami";
        int a=s.charAt(0)+s.charAt(s.length()-1);
        System.out.println(a);
    }


}
