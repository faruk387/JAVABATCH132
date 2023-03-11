package day06stringmanipulationsifstatement;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Example 1: Type code to check if given String contains a specific character or characters
        //           "New York" ==> w --> ture    -    York --> true    -    Xxx --> false
        String s="New York";
        boolean r1=s.contains("w");
        System.out.println("Is the String containing the given character or String? "+r1);
        //Example 2: Type code to change the first occurence of "java" to "python".

        String w="java is java, i like java";
        String wPython=w.replaceFirst("java","python");
        System.out.println(wPython);
        //Example 3: Type code to repeat a given String.
        String n= "Java";
        String nRepeat=n.repeat(4);
        System.out.println(nRepeat);

    }
}
