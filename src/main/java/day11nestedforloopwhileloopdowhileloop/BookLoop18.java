package day11nestedforloopwhileloopdowhileloop;

public class BookLoop18 {
    public static void main(String[] args) {
        String s="Hello";
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                s1=s1+s.charAt(i);
            }

        }
        System.out.println(s1);
    }
}
