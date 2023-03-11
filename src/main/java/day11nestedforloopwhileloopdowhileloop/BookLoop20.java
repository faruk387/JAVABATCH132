package day11nestedforloopwhileloopdowhileloop;

public class BookLoop20 {
    public static void main(String[] args) {
        String s="";
        for(int i=1;i<7;i++){
            for(int k=6;k>=i;k--){
                s=s+"*";

            }
            System.out.println(s);
            s="";

        }

    }
}
