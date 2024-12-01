package section8;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {

    //inside the static method we are declaring the same variable again and again. so we will declare those variable below for once
    static Consumer<Student> studentConsumer = System.out::println;
    static Consumer<Student> studentName = student -> System.out.print(student.getName());
    static Consumer<Student> studentActivity = student -> System.out.println(student.getActivities());
    static List<Student> allStudents = StudentDataBase.getAllStudents();


    public static void printName(){
        //Consumer<Student> studentConsumer = student -> System.out.println(student);
        //Consumer<Student> studentConsumer = System.out::println;
        //List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(studentConsumer);
    }

    public static void getNameAndActivity(){
        //Consumer<Student> studentName = student -> System.out.print(student.getName());
        //Consumer<Student> studentActivity = student -> System.out.println(student.getActivities());
        //List<Student> allStudents = StudentDataBase.getAllStudents();
        // consumer chaining
        allStudents.forEach(studentName.andThen(studentActivity));

    }

    public static void getNameAndActivityUsingCondition(){
        allStudents.forEach(student -> {
            if(student.getGradeLevel() == 4){
                studentName.andThen(studentActivity).accept(student);
            }
        });
    }


    public static void main(String[] args) {

        /*
        Consumer<String> consumer = (s) -> System.out.println("String to lower case "+s.toLowerCase());
        consumer.accept("HI");

        getNameAndActivity();

         */
        printName();

    }
}
