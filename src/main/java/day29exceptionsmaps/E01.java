package day29exceptionsmaps;

public class E01 {
    /*
    What are the differences between "throws" and "throw" keywords?
     1) "throw" is used inside the method body, "throws" is used in the method signature line.
     2) "throw" can be used multiple times in a method body, but "throws" can be used just once in the method signature line.
     3) After "throw" we create an Exception project, after "throws" we type just the name of the "Exception Class".
     4) After "throw" you can throw just a single Exception, after "throws" you van throw multiple Exception.
     5) "throw" can be used just to throw "RunTimeException"(Un-checked Exceptions),
        "throws" can be used to throw both "RunTimeException" or "CompiledTimeException"(Checked Exceptions).


          How to create our own Exception classes?
    1) Java created its own Exception Classes for common issues like dividing by zero, using non-existing indexes etc.
       As a developer we may need our own strict rules in our application.
       To create our strict rules in our applicaiton we create our own Exception Classes
       Our own Exception Classes are called "Custom Exception Classes".
     2) "Custom Exception Classes" can be  i) RunTimeException ii) CompiledTimeException
         To create RunTimeException, you must extend to "RunTimeException class"
         To create CompiledTimeException, you must extend to "CompiledTimeException Class"
         Every Exception class should have "Exception" word at the end.
 */

    public static void main(String[] args) {

    }
}
