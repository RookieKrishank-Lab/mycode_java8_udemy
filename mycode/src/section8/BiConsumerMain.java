package section8;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerMain {

    static List<Student> allStudents = StudentDataBase.getAllStudents();
    public static void TwoConditionConsumer(){
        BiConsumer<String, List> consumer = (name, activity) -> System.out.println("name: "+name+" and activity: "+activity);
        allStudents.forEach(student -> consumer.accept(student.getName(),student.getActivities()));
    }
    public static void main(String[] args) {
//        TwoConditionConsumer();

        BiConsumer<Integer, Integer> multiply = (a,b)-> System.out.println("multiplication value: " +(a*b));
        BiConsumer<Integer,Integer> division = (a,b) -> System.out.println("division value: "+(a/b));

        multiply.andThen(division).accept(10,2);

    }
}
