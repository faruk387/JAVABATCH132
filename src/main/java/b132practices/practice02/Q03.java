package b132practices.practice02;

public class Q03 {
      /*
    String shirtPrice= "$ 12.99";
    String bookPrice= "$ 35.99";
    Type code to find the sum of the shirt and book prices.
     */
      public static void main(String[] args) {
          String shirtPrice= "$ 12.99";
          String bookPrice= "$ 35.99";
          String shirtPrice1=shirtPrice.replace("$","").replace(" ","");
          String bookPrice1=bookPrice.replace("$","").replace(" ","");
          double a=Double.valueOf(shirtPrice1);////this will convert the data type of "shirt" object into double data type.
          double b=Double.valueOf(bookPrice1);
          System.out.println(a+b);



      }

}
