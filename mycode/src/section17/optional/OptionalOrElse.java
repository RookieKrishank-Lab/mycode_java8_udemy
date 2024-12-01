package section17.optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElse {

    //use this method when we dont have any data and we want to print a default value
    public static String optionalOrElse(){
        //Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.empty();
        return student.map(Student::getName).orElse("No student available");
    }

    //use this method when we dont have any data and we want to print a default value
    public static String optionalOrElseGet(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //Optional<Student> student = Optional.empty();
        return student.map(Student::getName).orElseGet(()->"No student available");
    }

    //use this method when we dont have any data and throw the exception back to caller
    public static String optionalOrElseThrow(){
        //Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> student = Optional.empty();
        return student.map(Student::getName).orElseThrow(()->new RuntimeException("No student available"));
    }

    public static void main(String[] args) {
        System.out.println("OrElse : "+optionalOrElse());
        System.out.println("OrElseGet : "+optionalOrElseGet());
        System.out.println("OrElseThrow : "+optionalOrElseThrow());
    }
}
