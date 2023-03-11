package day16arraylists;

public class PassByValuePassByReference {
    public static void main(String[] args) {
        /*
        1)PassByValue creates a copy of the value and uses the copy in the method.
          That is why methods can change just the copy not original value.
          Java uses PassByValue to protect original values
        2)Some programming languages like C-Sharp use PassByReference.
          PassByReference creates the copy of the reference(address) and use the copy in the methods.
          Copy Reference and Original Reference point the original value that is why original is updated by the methods.
          I mean if you use PassByReference, you cannot protect original values.
     */
        int shirtPrice=100;
        studentShirtPrice(shirtPrice,20);
        veteransShirtPrice(shirtPrice,10);
        seniorsShirtPrice(shirtPrice,5);
        System.out.println(shirtPrice);
        String name="Ajda";
        String result1=putExplanation(name);
        String result2=putExplanation("Ajda");
        System.out.println(result1);
        System.out.println(result2);
        Double salary1=5000.0;
        Double result3=newSalary(salary1);
        System.out.println(result3);
        int value=-5;
        int result4=absolutValue(value);
        System.out.println(result4);
        int a=25;
        int b=30;
        int result5=addition(a,b);
        System.out.println(result5);
        String name1="Faruk";
        String result6=initial(name1);
        System.out.println(result6);
        System.out.println(ascii("Faruk"));
    }
    public static void studentShirtPrice(int shirtPrice,int discount){
       int discountedPrice=shirtPrice-discount;
        System.out.println(discountedPrice);
    }
    public static void veteransShirtPrice(int shirtPrice,int discount){
        int discountedPrice=shirtPrice-discount;
        System.out.println(discountedPrice);
    }
    public static void seniorsShirtPrice(int shirtPrice,int discount){
        int discountedPrice=shirtPrice-discount;
        System.out.println(discountedPrice);
    }
    public static String putExplanation(String name){
        return name+"!";
    }
    //Create a method increases the salary 20 percent
    public static Double newSalary(Double salary){
        return salary*1.2;
    }
    //Create a method calculates the absolute value of an integer
    // -5 ==> 5     -     5 ==> 5       -      0 ==> 0
    public static int absolutValue(int value){
        if(value<0){
            return value*-1;
        }else{
            return value;
        }

    }
    //Create a method adds two integers
public static int addition(int a,int b){
        return a+b;
}



    //Create a method prints the first and the last character on the console
public static String initial(String s){
      return s.charAt(0)+""+s.charAt(s.length()-1);

}



    //Create a method prints the sum of the ASCII values of characters in a String
public static String ascii(String s){
        Integer asci=0;
        for(int i=0;i<s.length();i++){
            asci=asci+s.charAt(i);
        }

        return String.valueOf(asci);
}


}
