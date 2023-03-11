package day18varargsstringbuilderstringbuffer;

import day19constructorsaccessmodifiersstatic.Teacher;

public class TeacherRunner {
    public static void main(String[] args) {
        //if you are in a different package "default" variables vill be"inaccessible"
        //If you are in a different package and the class you created the object is not the "child class" "protected" variables
        //will be "inaccessible"
        //"private" things cannot be accesible from outside the class.
        //"public" one will be accessible from entire the project.
        Teacher myTeacher=new Teacher();
        System.out.println(myTeacher.teacherName);
    }
}
