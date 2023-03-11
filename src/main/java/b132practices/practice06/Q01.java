package b132practices.practice06;

public class Q01 {
     /*
         Create a method to calculate 4 students' 6, 4, 3 and 5 exams' average respectively.
    */

    public static void main(String[] args) {
        average("Ali",2.2,3,4);
        average("Ayse",3,5,7,9);
        average("Ahmet",8.5,5.8,7.2,9.8,5);
        average("Veli",8.5,5.8,7.2,9.8,5,8);

    }
    public static void average(String stdName,double...mark){
       double sum=0;
       for(double w:mark){
           sum=sum+w;
       }
        System.out.println(stdName+"'s Average of exams: "+String.format("%.2f",sum/mark.length));
    }
}
