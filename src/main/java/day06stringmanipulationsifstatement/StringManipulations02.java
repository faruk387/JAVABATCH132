package day06stringmanipulationsifstatement;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Example 1: Type code to check if a given String is empty or not.

        String s = "Java";
        boolean isEmpty = s.isEmpty();
        System.out.println("Is given String empty? " + isEmpty);
        //Example 2: Type code to check if a given String is containing just "space character" or not.
        String t = "  ";
        boolean isJustSpace = t.isBlank();
        System.out.println("Is given String containing just space?  " + isJustSpace);
        //Example 3: Type code to join multiple Strings.
        String w1="Parkland";
        String w2="Miami";
        String w3="USA";
        String concatW=w1.concat(w2).concat(w3);
        System.out.println(concatW);

    }
}
