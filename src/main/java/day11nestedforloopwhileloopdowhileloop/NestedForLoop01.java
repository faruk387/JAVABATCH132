package day11nestedforloopwhileloopdowhileloop;

public class NestedForLoop01 {
    public static void main(String[] args) {
        int numOfRows=10;
        for(int i=1;i<=numOfRows;i++){
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");

            }
            System.out.println();
        }

    }
}
