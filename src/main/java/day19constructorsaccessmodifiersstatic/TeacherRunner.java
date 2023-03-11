package day19constructorsaccessmodifiersstatic;

public class TeacherRunner {
    public static void main(String[] args) {
        Teacher myTeacher=new Teacher();
        //teacherNa,e variable is "public" that is why we can access it from entire project.
        System.out.println(myTeacher.teacherName);
        //phone variable is "protected" that is why we can access it from inside the package
        //phone variable and myTeacher object are in day19... package
        System.out.println(myTeacher.phone);
        //phone variable is "protected" that is why we can access it from inside the package
        //phone variable and myTeacher object are in day19... package
        System.out.println(myTeacher.salary);
        //In teacher class there is one more variable which is "ssn" but it is private
        //thats is why we can not access to it from TeacherRunner Class

    }
}
