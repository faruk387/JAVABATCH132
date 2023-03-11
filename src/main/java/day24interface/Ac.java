package day24interface;

public interface Ac {
     void cool();
     void heat();
     //1)By "using" default keyword before "return type" of the method,you can create "method with body" in an interface.
     //2)When you create "bacteriaKiller() default method", "Honda Concrete Child Class" will not complain,because
     //Overriding is mandatory for "abstract methods" but "bacteriaKiller() default method" is not abstract.
     //3)"default" in "bacteriaKiller() default method" is not "Access modifier",it is a new keyword to create "method with body" in an interface.
      default void bacteriaKiller(){
           System.out.println("Ac's kill the bacteria %99.9...");

     }
     //If you need a "method with body" and access it just y using "interface name" use "static" keyword.
     static void climate(){
          System.out.println("Climate setting are working");
     }
     void run();
     //Variables are "final" in an interface as default, that is why when you create a variable you have to initialize.
     //Variables are "public" in an interface as default, that is why when you create a variable no need to declare it is "public".
     //Variables are "static" in an interface as default, that is why when you try to access to a variable no need to create an object use just interface name.

      int price=2000;
      //Note: An interface

}
