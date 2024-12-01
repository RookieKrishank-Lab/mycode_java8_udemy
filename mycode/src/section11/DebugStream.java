package section11;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DebugStream {
    public static void main(String[] args) {
        Predicate<Student> studentGrade = student -> student.getGradeLevel()>3;
        Predicate<Student> studentGpa = student -> student.getGpa()>=3.5;

        Map<String, List<String>> stream = StudentDataBase.getAllStudents().stream()
                .peek(System.out::println)
                .filter(studentGrade)           //Stream<Student>
                .peek(student -> System.out.println("After the 1st filter "+student))
                .filter(studentGpa)
                .peek(student -> System.out.println("After the 2nd filter "+student))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));        //<Map>
        System.out.println(stream);
    }
}
