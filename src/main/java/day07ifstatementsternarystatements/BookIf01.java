package day07ifstatementsternarystatements;

public class BookIf01 {
    public static void main(String[] args) {
        /*
        Type code to print
 a) "Winter" for December, January, February
 b) "Spring" for March, April, May
 c) "Summer" for June, July, August
 d) "Fall" for September, October, November
 e) "Invalid month name" for all the other
         */
        String s="December";



        if(s=="December"||s=="January"||s=="February"){
            System.out.println("Winter");
        }else if(s=="March"||s=="April"||s=="May"){
            System.out.println("Spring");

        }else if(s=="Juni"||s=="July"||s=="Augusti"){
            System.out.println("Summer");

        }else if(s=="September"||s=="October"||s=="November"){
            System.out.println("Autumn");

        }else{
            System.out.println("Invalid month name");
        }
        String password = "a1b2c3d4";
        if(password.replaceAll("\\S", "").length()>0){
            System.out.println("Do not use space character in password");
        }else if(password.replaceAll("\\s", "").length()>=8){
            System.out.println("Valid Password");
        }else{
            System.out.println("Invalid Password");
        }
    }
}
