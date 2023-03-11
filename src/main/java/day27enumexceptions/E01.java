package day27enumexceptions;

public class E01 {
      /*
        1)Exception means "un-expected issue" in coding
        2)When we have Exception we have two ways
            i)We can handle the Exception by using "try-catch block"
            ii)We "Throw Exception" and block the application
        3)We handle the Exception mostly, if you do not handle the Exception
            i)Execution will be stopped
            ii)Application will be blocked
     */
      public static void main(String[] args) {
          System.out.println(divide1(6,5));//No Exception
          System.out.println(divide1(0,5));//No Exception
          System.out.println(divide1(6,0));//ArithmeticException==>/ by zero
          System.out.println("Hi this is me!");//divide(6,0) threw ArithmeticException that is why this code can not be executed.
                                               //When you break any mathematical rule like dividing by zero, Java throws ArithmeticException
          System.out.println(divide2(6,0));


      }

//Example 1: Create a method divides two doubles
    //1. way: Use if else
    public static int divide1(int a,int b){
          if(b==0){
              return 0;
          }else{
              return a/b;
          }

    }
    //2. way: Use try- catch
    public static int divide2(int a,int b){
      int result=0;
      try {

          result = a / b;

      }catch(ArithmeticException e){//"catch block" executed just for Exception,if "try block "does not throw any Exception.
                                    //"catch block" will not be executed.
          System.out.println("Do not use zero divisor...");
      }
      return result;
    }

}
