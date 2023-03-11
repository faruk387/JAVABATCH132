package day11nestedforloopwhileloopdowhileloop;

public class BookLoop12 {
    public static void main(String[] args) {
        int rows=4;
        int columns=8;
        String s="";
        for(int i=1;i<=rows;i++){
            if (i == 1 || i == rows) {
                for(int k=1;k<=columns;k++){
                    s=s+"A";
                }
                System.out.println(s);
            }else{
                s=s+"A";
                for(int m=2;m<columns;m++){
                    s=s+"X";
                }
                s=s+"A";
                System.out.println(s);
            }
        }
    }
}
