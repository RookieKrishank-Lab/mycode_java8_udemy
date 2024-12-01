package section9;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReference {

/*

    // for this method we cant write method reference
    static Predicate<Student> p1 = student -> student.getGradeLevel()>3;
*/
    static Predicate<Student> p1 = RefactorMethodReference::greaterThanGradeLevel;

    // we need to make this method as static as we are trying to refer a non-static method from a static method
    static public boolean greaterThanGradeLevel(Student student){
        return student.getGradeLevel()>3;
    }

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
