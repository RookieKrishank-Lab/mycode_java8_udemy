package section17.optional;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Optional;

public class OptionalFilterAndMap {

    public static void optionalFilter(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        student.filter(student1 -> student1.getGpa()>2.0)
                .ifPresent(System.out::println);
    }

    public static void optionalMap(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        student.filter(student1 -> student1.getGpa()>2.0)
                .map(Student::getName)
                .ifPresent(System.out::println);
    }

    //using flatMap we are going to retrieve the Optional Bike details from the student
    public static void optionalFlatMap(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.getOptionalStudent().get());
        student.filter(student1 -> student1.getGpa()>2.0)           //Optional<Student<Optional<Bike>>>
                .flatMap(Student::getBike)                          //Optional<Bike>
                .ifPresent(System.out::println);
    }

    public static void main(String[] args) {
//        optionalFilter();
//        optionalMap();
        optionalFlatMap();
    }

}
