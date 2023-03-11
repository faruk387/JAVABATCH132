package day11nestedforloopwhileloopdowhileloop;

public class BookLoop17 {
    public static void main(String[] args) {
        int num=325;
        int sum=0;
        for(int i=num;i>0;i/=10){
            sum=sum+i%10;

        }
        System.out.println(sum);
    }
}
