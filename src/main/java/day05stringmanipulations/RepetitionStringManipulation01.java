package day05stringmanipulations;

public class RepetitionStringManipulation01 {
    public static void main(String[] args) {
        //Example 1:Type code to check if seventh character of a given String is "a" or not.
        String s="Alabama state";
        boolean s1=s.charAt(6)=='a';
        System.out.println(s1);
        boolean s2=s.startsWith("a",6);
        System.out.println(s2);
        //Example 2: Type code to check if a String is ending with "money" or not.

        String t="Learn Java earn money";
        //1. way:substring
        boolean t1=t.substring(t.length()-5).equals("money");
        System.out.println(t1);
        //2. way
        boolean t2=t.endsWith("money");
        System.out.println(t2);
        //Example 3: Type code to convert "money" to "dollar"
        //Note: When you use replace() method,create a new container to store updated data in it.

        String m=t.replace("money","dollar");
        System.out.println(m);
        //Example 4: Type code to conver 'a' to "*".
        //Note:When you use replace("a","*") method,all "a"s are converted to"*".
        //Note: You can use 'char' and "Strings" in replace() method parenthesis.
        //      But both must be 'char' or both must be "String", you can not make one char, one String.
        String m1=t.replaceAll("a","*");
        System.out.println(m1);
    }
}
