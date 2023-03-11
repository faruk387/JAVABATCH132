package day12arrays;

public class BookArrays06 {
    public static void main(String[] args) {
        String s = "Apex is an  object oriented programming language";
        String[] s1=s.split(" ");
        int counter=0;
        for(String w:s1){
            if(w.startsWith("a")||w.startsWith("A")){
                counter++;
            }

        }
        System.out.println(counter);
    }
}
