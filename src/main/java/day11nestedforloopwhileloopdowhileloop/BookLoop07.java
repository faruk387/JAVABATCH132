package day11nestedforloopwhileloopdowhileloop;

public class BookLoop07 {
    public static void main(String[] args) {
        int num=3;
        for(int i=1;i<11;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
        //while
        int num1=3;
        int k=1;
        while(k<11){
            System.out.println(num1+"x"+k+"="+num1*k);
            k++;
        }
        //do while
        int num2=3;
        int z=1;
        do{
            System.out.println(num2+"x"+z+"="+num2*z);
            z++;
        }while(z<11);
    }
}
