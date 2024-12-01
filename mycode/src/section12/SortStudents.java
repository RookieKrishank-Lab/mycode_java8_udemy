package section12;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStudents {

    //method to sort student details by the name
    static List<Student> sortedStudentByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))             //Comparator to be used to compare stream elements. Returns new stream. In ascending order it will be sorted
//                .map(Student::getName)
                .collect(Collectors.toList());
    }

    //sort the student by gpa
    static List<Student> sortedStudentByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
//                .map(Student::getName)
                .collect(Collectors.toList());
    }

    //sort the student by gpa in desc
    static List<Student> sortedStudentByGpaDesc(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Sort Student by the name");
//        System.out.println("Student Name: "+sortedStudentByName());
//        sortedStudentByName().forEach(System.out::println);
/*
        System.out.println("Sort Student by gpa");
        sortedStudentByGpa().forEach(System.out::println);

        System.out.println("Sort Student by gpa in DESC");
        sortedStudentByGpaDesc().forEach(System.out::println);
*/
    }
}
