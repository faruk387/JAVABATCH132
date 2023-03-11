package day11nestedforloopwhileloopdowhileloop;

public class BookLoop01 {
    public static void main(String[] args) {
        // Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line
        //with a space between two consecutive integers
        //1-for loop
        for(int i=120;i>10;i--){
            if(i%4==0&&i%6==0){
                System.out.print(i+ " ");
            }
        }
        //2-while loop
        System.out.println();
        int i=120;
        while(i>10){
            if(i%4==0&&i%6==0){
                System.out.print(i+ " ");
            }
            i--;
        }
        System.out.println();
        int k=120;
        do{
            if(k%4==0&&k%6==0){
                System.out.print(k+ " ");
            }
            k--;
        }while(k>10);

    }
}
