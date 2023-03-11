package day07ifstatementsternarystatements;

public class IfStatements0101 {
    //Example 1: Type code to check if a given character is uppercase or lower case or others.
    public static void main(String[] args) {
        char ch='Z';
        if(ch>='a' && ch<='z' ){
            System.out.println("Lower case");
        }else if(ch>='A' && ch<='Z'){
            System.out.println("Upper case");
        }else{
            System.out.println("Others");
        }
        //Example 2: If a number is less than 300 or greater than 3000
//           print "Perfect Number" on the console, otherwise
//           print "Regular Number" on the console.
        int i=350;
        if(i<300 && i>3000){
            System.out.println("Perfect number");
        }else{
            System.out.println("Regular number");
        }
        //Example 3: Type code to check if a number is "Even or "Odd".
        int i1=25;
        if(i%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        //Example 4: Type a code to print the number of month for the given  month name.
        String month="January";
        if(month.equalsIgnoreCase("January")){
            System.out.println(1);
        }else if(month.equalsIgnoreCase("February")){
            System.out.println(2);
        }else if(month.equalsIgnoreCase("March")){
            System.out.println(3);
        }else if(month.equalsIgnoreCase("April")){
            System.out.println(4);
        }else if(month.equalsIgnoreCase("May")){
            System.out.println(5);
        }else if(month.equalsIgnoreCase("June")){
            System.out.println(6);
        }else if(month.equalsIgnoreCase("July")){
            System.out.println(7);
        }else if(month.equalsIgnoreCase("August")){
            System.out.println(8);
        }else if(month.equalsIgnoreCase("September")){
            System.out.println(9);
        }else if(month.equalsIgnoreCase("Oktober")){
            System.out.println(10);
        }else if(month.equalsIgnoreCase("November")){
            System.out.println(11);
        }else if(month.equalsIgnoreCase("December")){
            System.out.println(12);
        }else{
            System.out.println("not defined");
        }
    }
}
