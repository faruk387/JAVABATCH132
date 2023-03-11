package day04stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Example 1: Check the password if it has given rules.
        //           i)It should start with "J"
        //           ii)It should have at least 8 characters
        //           iii)Last 3 characters should be "AVA"


        String pwd="J12!?AVA";
        //i)It should start with "J"
        boolean a=pwd.startsWith("J");
        System.out.println("First Rule: "+a);
        //ii)It should have at least 8 characters
        //Note: There are "comparison operators" in Java: "==", "<", ">", "<=", ">=", "!="
        //      When you use comparison operators, you will get "boolean" everytime
        boolean b=pwd.length()>7;
        System.out.println("Second Rule: "+b);
        //iii)Last 3 characters should be "AVA"
        //Note: If you want to get characters from an index to the last character,
        //      use "substring()" method just with the starting index.
        boolean c=pwd.substring(pwd.length()-3,pwd.length()).equals("AVA");
        System.out.println("Third Rule: " +c);

 /*
            What did we learn today:
                1)charAt() ==> char
                2)toUpperCase() ==> String
                3)toLowerCase() ==> String
                4)trim() ==> String
                5)split() ==> We will learn it later
                6)length() ==> int
                7)substring(beginning Index, Ending Index) ==> String
                8)substring(beginning Index) ==> String
                9)equals() ==> boolean
                10)equalsIgnoreCase() ==> boolean
                11)startsWith() ==> boolean
​
                Note: When you learn method in Java, you should learn
                        i)What does the method do?
                        ii)What are the different usages?
                        iii)What does the method give you?
​
        */
    }
}
