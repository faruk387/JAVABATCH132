package day05stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Example 1:Type code to check if seventh character of a given String is "a" or not.
        String s="Alabama state";
        //1. Way:
        boolean result1 =s.charAt(6)=='a';
        System.out.println("Is the seventh character a? "+result1);
        //2. Way
        boolean result2 =s.startsWith("a",6);
        System.out.println("Is the seventh character a? "+result2);

        //Example 2: Type code to check if a String is ending with "money" or not.

        String t="Learn Java earn money";
        //1. way:substring
        boolean result3=t.substring(t.length()-5).equals("money");
        System.out.println("String is ending with money? "+result3);
        //2. way
        boolean result4=t.endsWith("money");
        System.out.println("Is the String ending with 'money'? "+result4);

        //Example 3: Type code to convert "money" to "dollar"
        //Note: When you use replace() method,create a new container to store updated data in it.
        String k=t.replace("money","dollar");
        System.out.println(k);
        System.out.println(t.replace("money","dollar"));

        //Example 4: Type code to conver 'a' to "*".
        //Note:When you use replace("a","*") method,all "a"s are converted to"*".
        //Note: You can use 'char' and "Strings" in replace() method parenthesis.
        //      But both must be 'char' or both must be "String", you can not make one char, one String.
        String k1=t.replaceAll("a","*");
        String k2=t.replace("a","*");
        System.out.println(k1);
        System.out.println(k2);

        String k3= t.replace("earn","win");
        System.out.println(k3);



    }
}
