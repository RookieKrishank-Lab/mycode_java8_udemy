package section12;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamFindFirstFindAny {

    public static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=4.9)
                .findFirst();
    }
    public static void main(String[] args) {

        Optional<Student> any = findAny();
        if(any.isPresent()){
            System.out.println("student with gpa >= 3: "+any.get());
        }else {
            System.out.println("No student found");
        }

        Optional<Student> first = findFirst();
        if(first.isPresent()){
            System.out.println("first student with gpa >= 3: "+first.get());
        }else {
            System.out.println("No student found");
        }
    }
}
