package day11nestedforloopwhileloopdowhileloop;

public class BookLoop08 {
    public static void main(String[] args) {
        for(int i=20;i>2;i--){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        int k=20;
        String s="";
        while(k>2){
            if(k%2!=0){
               s=s+k+" ";


            }
            k--;


        }
        System.out.println(s);


        String s1="";
        int z=20;
        do{
            if(k%2!=0){
                s1=s1+z+" ";


            }
            z--;
        }while(z>2);

        System.out.println(s1);

    }

}
