package day19constructorsaccessmodifiersstatic;

public class StudentsRunner {
    public static void main(String[] args) {
        Students std1=new Students("Tom",13,true,"male");
        Students std2=new Students("Ali",21,false);
        Students std3=new Students();
        Students std4=new Students("Ayse",23);
        System.out.println(std1.stdName);
        System.out.println(std2.gender);
        System.out.println(std2.age);
        System.out.println(std3.age);
        System.out.println(std3.success);
        System.out.println(std3.gender);
        System.out.println(std4.stdName);


    }

}
