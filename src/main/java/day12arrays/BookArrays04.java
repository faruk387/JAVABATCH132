package day12arrays;

public class BookArrays04 {
    public static void main(String[] args) {
        String[] s={"Kemal","Jonathan","Mark","Jackson","Ali"};
        for(String w:s){
            if(w.endsWith("n")||w.endsWith("k")){
                System.out.print(w.charAt(0));
            }

        }
    }
}
