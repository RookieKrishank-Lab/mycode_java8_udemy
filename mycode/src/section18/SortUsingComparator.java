package section18;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class SortUsingComparator {

    static Consumer<Student> studentConsumer = student ->  System.out.println(student.getName());            //Student::getName

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before sorting");
        studentList.forEach(studentConsumer);
    }
}
