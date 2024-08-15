package section8;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class StudentPredicate {

    static Predicate<Student> p1 = student -> student.getGradeLevel()>3;
    static Predicate<Student> p2 = student -> student.getGpa()>=3.9;
    static List<Student> allStudents = StudentDataBase.getAllStudents();

    public static void GradeAndGpa(){
        allStudents.forEach(student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }
    public static void main(String[] args) {
        GradeAndGpa();
    }
}
