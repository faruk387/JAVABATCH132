package day11nestedforloopwhileloopdowhileloop;

public class BookLoop11 {
    public static void main(String[] args) {
        String s="Mark";

        for(int i=s.length()-1;i>-1;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        String k="Mark";
        int i1=k.length()-1;
        while(i1>-1){
            System.out.print(s.charAt(i1));
            i1--;

        }
    }
}
