package section11;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//we are passing all the student list through the stream and at the end we are collecting the name of the student and its corresponding activity
public class StudentNameAndActivity {
    public static void main(String[] args) {

        Predicate<Student> studentGrade = student -> student.getGradeLevel()>3;
        Predicate<Student> studentGpa = student -> student.getGpa()>=4;

        Map<String, List<String>> stream = StudentDataBase.getAllStudents().stream()
                .filter(studentGpa)             //Stream<Student>
                .filter(studentGrade)           //Stream<Student>
//                .filter(studentGpa)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));        //<Map>
        System.out.println(stream);
    }
}

