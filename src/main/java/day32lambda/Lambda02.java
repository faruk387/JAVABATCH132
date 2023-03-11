package day32lambda;

import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        System.out.println(getSum(7,100));
        System.out.println(getMultip(13,11));
        System.out.println(getFactorial(5));
        System.out.println(getSumOfEvenNumbers(7,5));
        System.out.println(sumOfDigits(45,47));
    }
    //1)Create a method to find the sum of integers from 7 to 100
    public static int getSum(int starting,int ending){

        if(starting>ending){
            int temp=starting;
            starting=ending;
            ending=temp;
        }

        return    IntStream.rangeClosed(starting,ending).sum();

    }
    public static int getMultip(int starting,int ending){
        if(starting>ending){
            int temp=starting;
            starting=ending;
            ending=temp;
        }
        return IntStream.rangeClosed(starting,ending).reduce(Math::multiplyExact).getAsInt();
    }
  //3)Create a method to calculate the factorial of a given number.(5!=1*2*3*4*5)
    public static int getFactorial(int number){
        if(number==0){
            return 1;
        }else if(number<0){
         number=   Math.abs(number);
        }
      return   IntStream.rangeClosed(1,number).reduce(Math::multiplyExact).getAsInt();

    }
    //4)Create a method to calculate the sum of even integers between given two integers
    public static int getSumOfEvenNumbers(int starting,int ending){
        if(starting>ending){
            int temp=starting;
            starting=ending;
            ending=temp;
        }
       return IntStream.rangeClosed(starting,ending).filter(t-> t%2==0).sum();
    }
    //5)Create a method to calculate the sum of digits of every integers between given two integers
    //45 46 47==? 4+6+4+6+4+7=30
    public static int sumOfDigits(int starting,int ending){
        return IntStream.rangeClosed(starting,ending).map(Utils::getSumOfDigit).sum();
    }
}
