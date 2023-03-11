package day04stringmanipulations;

public class RepetitionStringManipulations02 {
    public static void main(String[] args) {
        //Example 1: Get the first 4 characters from a String and convert them to lower cases
        //           Albania ==> Alba ==> alba
        String s="Germany";
       String a=s.substring(0,4).toLowerCase();
        System.out.println(a);
        //Example 2: Check if two Strings are same or not?

        String r="Java";
        String u="java";
        boolean b=r.equals(u);
        System.out.println(b);
        boolean b1=r.equalsIgnoreCase(u);
        System.out.println(b1);


    }
}
