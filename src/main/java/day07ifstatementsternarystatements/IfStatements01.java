package day07ifstatementsternarystatements;

public class IfStatements01 {
    public static void main(String[] args) {
        //Example 1: Type code to check if a given character is uppercase or lower case or others.
        char ch='!';
        if(ch>='A'&&ch<='Z'){
            System.out.println("Given character is upper case");
        } else if(ch>='a'&& ch<='z'){
            System.out.println("Given character is lower case");

        }else{
            System.out.println("Given character is neither upper case nor upper case");
        }
        //Example 2: If a number is less than 300 or greater than 3000
//           print "Perfect Number" on the console, otherwise
//           print "Regular Number" on the console.
        int num=3200;
        if(num<300 || num>3000){
            System.out.println("Perfect number");

        }else {
            System.out.println("Regular number");
        }
        //Example 3: Type code to check if a number is "Even or "Odd".
        int n=8;
        if(n%2==0){
            System.out.println("The given number is even");

        }else{
            System.out.println("The given number is odd");
        }
        //Example 4: Type a code to print the number of month for the given  month name.
        String monthName="march";
        if(monthName.equalsIgnoreCase("January")){
            System.out.println(1);
        }else if(monthName.equalsIgnoreCase("February")){
            System.out.println(2);
        }else if(monthName.equalsIgnoreCase("March")){
            System.out.println(3);
        }else if(monthName.equalsIgnoreCase("April")){
            System.out.println(4);
        }else if(monthName.equalsIgnoreCase("May")){
            System.out.println(5);
        }else if(monthName.equalsIgnoreCase("June")){
            System.out.println(6);
        }else if(monthName.equalsIgnoreCase("July")){
            System.out.println(7);
        }else if(monthName.equalsIgnoreCase("August")){
            System.out.println(8);
        }else if(monthName.equalsIgnoreCase("September")){
            System.out.println(9);
        }else if(monthName.equalsIgnoreCase("October")){
            System.out.println(10);
        }else if(monthName.equalsIgnoreCase("November")){
            System.out.println(11);
        }else if(monthName.equalsIgnoreCase("December")){
            System.out.println(12);
        }else{
            System.out.println("Invalid month name");
        }
        }

}
