package section8;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StudentPredicateConsumerExample1 {


//    Predicate<Student> p1 = student -> student.getGradeLevel()>3;
//    Predicate<Student> p2 = student -> student.getGpa()>=3.9;

    // combining 2 predicate together ie BiPredicate
    BiPredicate<Integer,Double> studentBiPredicate= (grade, gpa)-> grade>3 && gpa>=3.9;

    BiConsumer<String, List<String>> studentBiConsumer= (name,activity) -> System.out.println("Name: "+name+" and Activity: "+activity);

    Consumer<Student> studentConsumer = student -> {
//        if(p1.and(p2).test(student)){
        if(studentBiPredicate.test(student.getGradeLevel(),student.getGpa())){
            studentBiConsumer.accept(student.getName(),student.getActivities());
        }
    };

    public void printNameAndActivity(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        new StudentPredicateConsumerExample1().printNameAndActivity(allStudents);
    }
}
