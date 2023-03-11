package b132practices.practice04;

public class Q02 {
    //Type code to print the integers divisible by 4 and 6 from 13 to 211.
    //first way
    public static void main(String[] args) {
        for(int i=13;i<212;i++){
            if(i%4==0&&i%6==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        //while loop
        int k=13;
        while(k<212){
            if(k%4==0&&k%6==0) {
                System.out.print(k + " ");

            }
            k++;
        }
    }
}
