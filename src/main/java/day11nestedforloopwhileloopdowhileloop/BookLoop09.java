package day11nestedforloopwhileloopdowhileloop;

public class BookLoop09 {
    public static void main(String[] args) {
        String s="Ali Can";
        String s1=s.replaceAll("[^a-z]","");
        String s2="";
        for(int i=0;i<s1.length();i++){
            s2=s2+s1.charAt(i)+"*";

        }
        System.out.println(s2);

        String s3="";
        int i=0;
        while(i<s1.length()){
            s3=s3+s1.charAt(i)+"*";

            i++;
        }
        System.out.println(s3);
        String s4="";
        int z=0;
        do{
            s4=s4+s1.charAt(z)+"*";
            z++;
        }while(z<s1.length());
        System.out.println(s4);
    }
}
