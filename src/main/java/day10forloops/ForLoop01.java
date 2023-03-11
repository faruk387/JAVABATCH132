package day10forloops;

public class ForLoop01 {
    //Example 1: Type code to calculate the multiplication of integers from 3 to 6
    //           3*4*5*6 ==> 360
    public static void main(String[] args) {
        int a=1;
        for(int i=3;i<7;i++){
            a=a*i;
        }
        System.out.println(a);
        //Example 2: Type code to find  the sum of the digits in a given integer
        //           578 ==> 5+7+8=20
        int sum=0;
        int num=578;
        num=Math.abs(num);
        for(int i=num;i>0;i/=10){
            sum=sum+i%10;

        }
        System.out.println(sum);
         /*
            Note 1: If you want to get the last digit of an integer use "number%10"
            Note 2: If all numbers are Integers in a mathematical operation, the result will be in "Integer" data type.
                    If the result is in decimal data type, Java converts the decimal to Integer by removing the decimal part.
                    Java does not do "rounding operation" to convert decimals to integers
                    57/10 ==> 5
            Note 3: If you use different data types in mathematical operations, the result will be in the largest data type
                    12/5.0 ==> 2.4
                    57.0/10 ==> 5.7
                    57/10.0 ==> 5.7
                    57.0/10.0 ==> 5.7
         */

        //Example 3: Type code to check if a String is "palindrome" or not?
        //           anna, civic, 1234321 is palindrome
        String s="annax";
        System.out.println(s);
        String s1="";
        for(int i=s.length()-1;i>-1;i--){
            s1=s1+s.charAt(i);

        }
        System.out.println(s1);
        if(s1.equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }


}
