package b132practices.practice02;

public class Q01 {
    public static void main(String[] args) {
        //Type code to check if a String does not have any space character at the beginning and at the end
        //Example==> ' Ali ' should print false on the console
        //            'Ali' should print true on the console
      String s="  I love you";
      boolean s1=s.trim().length()==s.length();
        System.out.println("Is there a space at the beginning and at the end: "+s1);
      String trimmedString=s.trim();
      boolean s2=s.equals(trimmedString);
        System.out.println("Is there a space at the beginning and at the end: "+s2);

    }

}
