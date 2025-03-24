package section15;

import data.StudentDataBase;

import java.util.Objects;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.counting;

//using count we
public class StreamCountingExample {

    public static long count1(){
        return StudentDataBase.getAllStudents()
                .stream()
                .count();
    }

    public static long count2(){
        return StudentDataBase.getAllStudents()
                .size();
    }

    public static long count3(){
        return StudentDataBase.getAllStudents()
                .stream()
//                .collect(Collectors.counting());
                .collect(counting());
    }

    public static long countWithCondition() {
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(Objects::nonNull)// Filter out null values
                .filter(student -> student.getGpa() > 2)
                .collect(counting());
    }

        public static void main(String[] args) {
        System.out.println("total number of element using count: "+count1());
        System.out.println("total number of element using size: "+count2());
        System.out.println("total number of element using counting: "+count3());
        System.out.println("total number of element using counting and condition: "+countWithCondition());
    }
}
