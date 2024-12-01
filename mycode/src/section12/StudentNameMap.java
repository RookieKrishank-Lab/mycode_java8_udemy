package section12;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StudentNameMap {

    public static List<String> nameList(){
        List<String> stringList = StudentDataBase.getAllStudents().stream()         // op is of Stream<Student>
//                .map(student -> student.getName())
//                .peek(student -> System.out.println(student))
                // this map is converting the whole Stream type ie from Stream<Student> to  Stream<String>
                .map(Student::getName)               // op is of Stream<String>
//                .peek(student -> System.out.println(student))
                // this map is performing operations
                .map(studentName -> studentName.toUpperCase())
                .collect(Collectors.toList());          //op is of List<String>
        return stringList;
    }

    //

    public static void main(String[] args) {
        System.out.println(nameList());
    }

}
