package day11nestedforloopwhileloopdowhileloop;

public class BookLoop10 {
    public static void main(String[] args) {
        double num=75.4238;
        String s=String.valueOf(num);
        String s1=s.substring(s.indexOf(".")+1);
        String s2="";
        System.out.println(s1);
        int i=0;
        do{
            s2=s2+"*"+s1.charAt(i);
            i++;
        }
        while(i<s1.length());
        System.out.println(s2);
    }


}
