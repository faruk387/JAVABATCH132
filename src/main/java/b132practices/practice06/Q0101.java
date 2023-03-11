package b132practices.practice06;

public class Q0101 {
     /*
         Create a method to calculate 4 students' 6, 4, 3 and 5 exams' average respectively.
    */
     public static void main(String[] args) {
         average("Ali Can",20,33,27);

     }
     public static void average(String stdName,double...b){
         double sum=0;
         for(double w:b){
             sum=sum+w;
         }
         System.out.println(stdName+" average mark is: "+String.format("%.2f",sum/b.length));
     }
}
