package day17methodoverloadingdatetimeclasses;

public class MethodCreation {
    public static void main(String[] args) {
        //Actual values used in method parenthesis are called "arguments"

        int result1=addition(15,25);
        System.out.println(result1);
        String result2=initial("Faruk");
        System.out.println(result2);
        int result3=ascii("Faruk");
        System.out.println(result3);

    }
    //Example 1: Create a method adds two integers
    //Variables used in method parenthesis are called "parameters"
    public static int addition(int a,int b){
        return a+b;
    }
    //Example 2: Create a method prints the first and the last character of a String on the console
    public static String initial(String s){
        return s.charAt(0)+""+s.charAt(s.length()-1);

    }
    //Example 3: Create a method prints the sum of the ASCII values of characters in a String
    public static int ascii(String s){
        int ascii=0;
        for(int i=0;i<s.length();i++){
            ascii=ascii+s.charAt(i);
        }
        return ascii;
    }
}
