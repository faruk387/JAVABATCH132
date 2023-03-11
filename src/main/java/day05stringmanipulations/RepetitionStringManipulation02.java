package day05stringmanipulations;

public class RepetitionStringManipulation02 {
    public static void main(String[] args) {
        //Example 1: Delete all "y"s from a given String
        String s= "Everything is easy if you study";
        String s1=s.replaceAll("y","");
        System.out.println(s1);
        //Example 2: Delete all digits from a given String.
        String t="Tom is 13 years old, and his GPA is 3,98";
        String t1=t.replaceAll("[0-9]","");
        System.out.println(t1);
        //Example 3: Delete all vowels from a given String.
        String t2=t.replaceAll("[aeiuoAEIUO]","");
        System.out.println(t2);
        //Example 4: Count how many letters are there in a String.
        System.out.println(t.replaceAll("[^a-zA-Z]","").length());
        //Example 5: Count how many digits are there in a String
        System.out.println(t.replaceAll("[^0-9]","").length());
        //Example 6: Check the user's password according to the given rules
//           i)Password should have at least 8 characters
//           ii)Password should not have "space" character
//           iii)Password should have at least 1 upper case
//           iv)Password should have at least 1 lower case
//           v)Password should have at least 1 symbol
//           vi)Password should have at least 1 digit
        String pwd="As1?fde3";
        boolean i1=pwd.length()>7;
        System.out.println(i1);
        boolean i2=pwd.replaceAll(" ","").length()==pwd.length();
        System.out.println(i2);
        boolean i3=pwd.replaceAll("[A-Z]","").length()!=pwd.length();
        System.out.println(i3);
        boolean i4=pwd.replaceAll("[a-z]","").length()!=pwd.length();
        System.out.println(i4);
        boolean i5=pwd.replaceAll("[^a-zA-Z0-9]","").length()>0;
        System.out.println(i5);
        boolean i6=pwd.replaceAll("[0-9]","").length()!=pwd.length();
        System.out.println(i6);

    }
}
