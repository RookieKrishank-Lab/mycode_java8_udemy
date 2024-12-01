package section9;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

//instance method reference. Here we are only printing the activity list which is inside each student object
public class ConsumerMethodReference {

    // to print each student from the list
    //static Consumer<Student> studentConsumer = student -> System.out.println(student);
    static Consumer<Student> studentConsumer = System.out::println;

    // contain all the student in a list
    static List<Student> allStudent = StudentDataBase.getAllStudents();


    //static Consumer<Student> studentActivity= (student)-> student.printListOfActivities();
    static Consumer<Student> studentActivity= Student::printListOfActivities;
    public static void main(String[] args) {

        allStudent.forEach(studentActivity);

//        allStudent.forEach(studentConsumer);
//        Student student = new Student();
//        System.out.println(allStudent.printListOfActivities());
        // Printing activities of each student
//        allStudents.forEach(student -> System.out.println(student.getActivities()));

    }
}
