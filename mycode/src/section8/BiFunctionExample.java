package section8;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/*
* Same as FunctionStudentExample class but using biFunction we are going.
* First arg is list of student and 2nd arg is predicate function.
* predicate is the functional interface implementation
* */
public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction = (students,studentPredicate) -> {
        HashMap<String,Double> studentGradeMap = new HashMap<>();

        students.forEach(student -> {
            if(studentPredicate.test(student)){
                studentGradeMap.put(student.getName(),student.getGpa());
            }
        });
        return studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), StudentPredicate.p1));
    }
}
