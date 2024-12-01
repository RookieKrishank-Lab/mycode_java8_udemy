package section9;

import data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {

    static Supplier<Student> supplier = Student::new;           // it will call a default parameter ie no arg constructor
    static Function<String,Student> studentFunction = Student::new;          // it will call a parameterize constructor with 1 arg

    public static void main(String[] args) {
        System.out.println(supplier.get());
        System.out.println(studentFunction.apply("1 arg"));
    }
}
