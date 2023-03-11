package day11nestedforloopwhileloopdowhileloop;

public class BookLoop06 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            String s="";
            for(int k=1;k<=i;k++){
                s=s+"A";
            }
            System.out.println(s);
        }
        //
        int i=1;
        while(i<5){
            String s="";
            for(int k=1;k<=i;k++){
                s=s+"A";
            }
            i++;
            System.out.println(s);
        }
        //do while
        int b=1;
        do{
            String s="";
            for(int k=1;k<=b;k++){
                s=s+"A";
            }

            System.out.println(s);
            b++;
        }while(b<5);

    }
}
