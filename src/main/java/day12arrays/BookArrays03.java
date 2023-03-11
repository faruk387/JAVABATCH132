package day12arrays;

public class BookArrays03 {
    public static void main(String[] args) {
        String[] s={"Kemal","Jonathan","Mark","Angie","Veli"};
        int minLength=s[0].length();
        for(String w:s){
            minLength=Math.min(minLength,w.length());
        }
        for(String w: s){
            if(minLength==w.length()){
                System.out.println(w);
            }
        }
    }
}
