package day11nestedforloopwhileloopdowhileloop;

public class BookLoop05 {
    public static void main(String[] args) {
        //for
        for(int i=1;i<4;i++){
            String s="";
            for(int k=1;k<6;k++){

                s=s+"A";

            }
            System.out.println(s);
        }
        //while
        int i=1;
        while(i<4){
            String s="";
            for(int k=1;k<6;k++){
                s=s+"A";

            }
            System.out.println(s);
            i++;
        }
        //do while
       int z=1;
        do{
            String s="";
            for(int b=1;b<6;b++){
                s=s+"A";
            }
            System.out.println(s);
      z++;
        }while(z<4);

    }
}
