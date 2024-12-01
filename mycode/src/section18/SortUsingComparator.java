package section18;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class SortUsingComparator {

    static Consumer<Student> studentConsumer = Student::getName;

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before sorting");
        System.out.println(studentList.forEach(studentConsumer));
    }
}
