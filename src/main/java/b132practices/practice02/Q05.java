package b132practices.practice02;

public class Q05 {
    //1.Task: Count the alphabetical characters in a given value.
    public static void main(String[] args) {


        String str = "Wow!...Ali is 13 years old and he is a university student!!!";
        System.out.println("Total number character in String is: "+str.length());
       String str1= str.replaceAll("[^a-zA-Z)]","");
        System.out.println("Total number of alphabetical characters in the string is: "+str1.length());


    }

}
