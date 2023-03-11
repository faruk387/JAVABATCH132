package day04stringmanipulations;

public class RepetitionStringManipulations03 {
    //Example 1: Check the password if it has given rules.
    //           i)It should start with "J"
    //           ii)It should have at least 8 characters
    //           iii)Last 3 characters should be "AVA"
    public static void main(String[] args) {
        String pwd="J12!?AVA";
        boolean p1=pwd.charAt(0)=='J';
        System.out.println(p1);
        boolean p2=pwd.length()==8;
        System.out.println(p2);
        boolean p3=pwd.substring(pwd.length()-3,pwd.length()).equals("AVA");
        System.out.println(p3);
    }
}
