package day11nestedforloopwhileloopdowhileloop;

public class BookLoop15 {
    public static void main(String[] args) {
        String result="";
        char ch='C';
        do{
            result=result+ch;
            ch--;
        }while(ch>='A');
        System.out.println(result);
    }
}
