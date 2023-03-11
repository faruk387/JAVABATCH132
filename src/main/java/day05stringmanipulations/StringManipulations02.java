package day05stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Example 1: Delete all "y"s from a given String
        String s= "Everything is easy if you study";
        String s1=s.replace("y","");
        System.out.println((s1));
        //Example 2: Delete all digits from a given String.
        String t="Tom is 13 years old, and his GPA is 3,98";
        //Note: Just a single digit i a data,all digits are a group of data.
        //      To tell Java something about a group of data we use "Regular Expressions"(Regex).
        /*
        What is the Regex?
        1)All digits ==>[0-9]
        2)All lower cases ==> [a-z]
        3)All upper cases ==> [A-Z]
        4)All letters ==>[a-zA-z]
        5)All letters and digits==>[a-zA-Z0-9]
        6)All vowels==>[aeiouAEIOU]
        7)All punctuation marks==>\\p{Puncth}
        8)All characters different from(^) digit ==>[^0,9]
        9)All characters different from(^) lower cases==>[^a-z]
      10)All characters different from(^) letters==>[^a-zA-Z]
      11)All characters different from(^) vowels==>[^aeiouAEIOU]

         */

        String t1=t.replaceAll("[0-9]","");
        System.out.println(t1);

        //Example 3: Delete all vowels from a given String.
        String u="Tom, are you here?";
        String u1=u.replaceAll("[aeiouAEIOU]","");
        System.out.println(u1);
        //Example 4: Count how many letters are there in a String.
        String m="Tom, are you here?";
        int m1=m.replaceAll("[^a-zA-z]","").length();
        System.out.println(m1);
        //Example 5: Count how many digits are there in a String
        String n = "Tom is 13 years old, and his GPA is 3.98";
        int m2=n.replaceAll("[^0-9]","").length();
        System.out.println(m2);
        //Example 6: Check the user's password according to the given rules
//           i)Password should have at least 8 characters
//           ii)Password should not have "space" character
//           iii)Password should have at least 1 upper case
//           iv)Password should have at least 1 lower case
//           v)Password should have at least 1 symbol
//           vi)Password should have at least 1 digit
        String pwd="As1?fdes3";
        boolean i1= pwd.length()>7;
        System.out.println("Does password have at least 8 characters: "+i1);
        boolean i2=pwd.replaceAll("[^ ]","").length()==0;
        System.out.println("Is the password containing space character: "+i2);
        boolean i3=pwd.replaceAll("[^A-Z]","").length()>0;
        System.out.println("Is the password containing upper case character: "+i3);
        boolean i4=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println("Is the password containing lower case character: "+i4);
        boolean i5=pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println("Is the password containing symbol: "+i5);
        boolean i6=pwd.replaceAll("[^1-9]","").length()>0;
        System.out.println("Is the password containing a digit: "+i6);



    }
}
