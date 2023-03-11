package day28exceptions;

public class E01 {
    /*
        1)To handle multiple Exceptions you can use "multiple catch blocks" or "single catch block"
        2)If you prefer to use "single catch block" use "Exception" in "catch parenthesis"
        3)When you use "multiple catch blocks" the order of the catch blocks is not important if and only if
          the Exception Classes do not have parent child relationship among them.
          If there is parent child relationship among them the child must be used first.
     */
    public static void main(String[] args) {
       String s1="240";
        System.out.println(divide(s1));
        String s2=null;
        System.out.println(divide(s2));
        String s3="2a4b0c";
        System.out.println(divide(s3));
        String s4="2";
        System.out.println(divide(s4));
        System.out.println("====================");
        String s5="240";
        System.out.println(divide2(s5));
        String s6=null;
        System.out.println(divide2(s6));
        String s7="2a4b0c";
        System.out.println(divide2(s7));
        String s8="2";
        System.out.println(divide2(s8));

    }
    //Example 1: Create a method divides an integer converted from a String by the 1 less than the number of characters of String
    //           String s="240";==> 240/3=80
    //2. way. How to handle multiple Exceptions by using just a multiple catch block
    public static int divide(String s){
        int result=0;
       try{
           int length=s.length()-1;//Null pointer exception
           int num= Integer.valueOf(s);//NumberFormatException
           result= num/length;//Arithmetic Exception
       }catch (NullPointerException e){
           System.out.println("Most probably the String is null - "+e.getMessage());

       }catch (NumberFormatException e){
           System.out.println("Most probably the String contains non-digit character - "+e.getMessage());

       }catch (ArithmeticException e){
           System.out.println("Most probably divisor i 0 - "+e.getMessage());
       }
       return result;


    }
    //2. way. How to handle multiple Exceptions by using jsut a single catch block
    public static int divide2(String s){
        int result=0;
        try{
            int length=s.length()-1;//Null pointer exception
            int num= Integer.valueOf(s);//NumberFormatException
            result= num/length;//Arithmetic Exception
        }catch (Exception e){
            System.out.println("An exception occured - "+e.getMessage());
        }
return result;

    }
    //3.Way: How to handle multiple Exceptions by using Exception and any other
    public static int divideByNumOfCh(String s){
        int result = 0;
        try {
            int numOfChars = s.length();//NullPointerException is possible
            int num = Integer.valueOf(s);//NumberFormatException is possible
            result = num / (numOfChars - 1);//ArithmeticException is possible
        }catch(ArithmeticException e){
            System.out.println("Most probably divisor is zero - " + e.getMessage());
        }catch(Exception e){
            System.out.println("An Exception occurred - " + e.getMessage());
        }
        return result;
    }
}
