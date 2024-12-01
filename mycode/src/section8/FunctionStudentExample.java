package section8;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/*
* Take studentList as argument and in return we will get a Map with student name and gpa. Student in the map should be greater than grade lvl 3
* */
public class FunctionStudentExample {

//    static Predicate<Student> p1 = student -> student.getGradeLevel()>3;
    static Function<List<Student>, Map<String,Double>> studentFunction = students -> {

        //we need to create a map where we will insert studentName and gpa
        Map<String, Double> studentGradeMap= new HashMap<>();

        students.forEach(student -> {
            if(StudentPredicate.p1.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        });

        return studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }

}
