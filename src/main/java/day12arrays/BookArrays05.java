package day12arrays;

public class BookArrays05 {
    public static void main(String[] args) {
        String[] s={"Kemal","Jonathan","Mark","Angie","Veli"};
        int sum=0;
        for(String w:s){
            sum=sum+w.length();
        }
        System.out.println(sum);
    }
}
