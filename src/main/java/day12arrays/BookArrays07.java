package day12arrays;

public class BookArrays07 {
    public static void main(String[] args) {
        String s = "Apex is an object oriented programming language";
        String[] arr = s.toLowerCase().split("");
        int counter = 0;
        for(String w : arr){
            switch(w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println("The number of vowels is " + counter);
    }
}
