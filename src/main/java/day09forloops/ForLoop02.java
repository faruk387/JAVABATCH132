package day09forloops;

public class ForLoop02 {
    public static void main(String[] args) {
        //Example 1: Put * between 2 consecutive characters and to the end in a String.
        //           For example; "Java" ==> J*a*v*a*
       String s="Java";
       for(int i=0;i<s.length();i++){
           System.out.print(s.charAt(i)+"*");
       }
        //Example 2: Type code to print unique characters in a String.
        //           Hello ==> Heo
        System.out.println();
        String s1="Hello";
        for (int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);

            if(s1.indexOf(ch)==s1.lastIndexOf(ch)){
                System.out.print(ch);

            }


        }
        System.out.println();
        //Example 3: Type code to print a String in reverse.
        //           For example; "Ali Can" ==> "naC ilA"
        String s2="Ali Can";
        for(int i=s2.length()-1;i>=0;i--){
            System.out.print(s2.charAt(i));
        }
        System.out.println();
        //Example 4: Type code to find the sum of the integers from 3 to 7
        int a=0;
        for(int i=3;i<8;i++){
            a=a+i;

        }
        System.out.println(a);



    }
}
