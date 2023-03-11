package day11nestedforloopwhileloopdowhileloop;

public class BookLoop03 {
    public static void main(String[] args) {
        //Type code to check whether a String is palindrome or not. If a String is the same with its
        //reverse then it is called palindrome. For example; “anna”, “123321” are palindromes
        //for loop
        String s="anna";
        String s1="";
        for(int i=s.length()-1;i>-1;i--){
            s1=s1+s.charAt(i);

        }
        System.out.println(s1);
        if(s1.equals(s)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        //while
        String s3="anna";
        String s2="";
        int i=s3.length()-1;
        while(i>-1){
            s2=s2+s3.charAt(i);
            i--;

        }
        System.out.println(s2);
        if(s2.equals(s3)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        //do while
        String a="anna";
        String b="";
        int k=a.length()-1;
        do{
            b=b+a.charAt(k);
            k--;
        }while(k>-1);

        System.out.println(b);
        if(a.equals(b)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
