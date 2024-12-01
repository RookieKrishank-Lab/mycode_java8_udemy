package section8;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierMain {

    public static void main(String[] args) {

        // return a student object
        Supplier<Student> soloStudent = () -> new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
        System.out.println("Solo student: "+soloStudent.get());

        // return list of student from student database
        Supplier<List<Student>> allStudent = StudentDataBase::getAllStudents;
        System.out.println("List of students: "+allStudent.get());
    }
}
