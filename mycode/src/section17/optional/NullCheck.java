package section17.optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class NullCheck {

    public static Optional<String> getStudentNameOptional(){
        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());         //As we are unsure about the data of StudentDataBase studentSupplier ie we dont know if it will be present of not so that's why we have use ofNullable method
        //Optional<Student> student = Optional.ofNullable(null);
        if(student.isPresent()){
            return student.map(Student::getName);       //this map not the stream map. it is part of Optional class. This will return Optional<String>
        }
        return Optional.empty();                        //optional obj with no value. We use this when we know the variable output will always be null
    }

    public static void main(String[] args) {
        System.out.println(getStudentNameOptional().get());
    }

}
