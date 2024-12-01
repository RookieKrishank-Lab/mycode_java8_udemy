package section12;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class StreamReduce {

    // stream result will have multiplication of all the numbers present inside the list
    public static int listMultiplication(List<Integer> integers){
        return integers.stream()
                // 1st time a at starting will 1 as we have taken 1 as initial value. b will be 1 as the first element of the list is 1. return 1
                // 2nd time a will be 1 as the output of previous calculation is 1. b will be 2 as the second element of the list is 2. return 2
                // a will be the output of the previous calculation and b will be the current value of the stream
                //1*1 = 1
                //1*2 = 2
                //2*3 = 6
                .reduce(1,(a,b)->a*b);
    }

    public static Optional<Integer> listMultiplicationOptional(List<Integer> integers){
        return integers.stream()
                .reduce((a,b)->a*b);
    }

    // student with the highest gpa
    public static Optional<Student> highestGpaStudent(List<Student> students){
        return students.stream()
                // student one my one
                .peek(student -> System.out.println(student.getName()))
                .peek(student -> System.out.println("---"))
                .reduce((s1,s2)->(s1.getGpa()> s2.getGpa()) ? s1: s2);
    }


    public static void main(String[] args) {

        /*List<Integer> integerList = Arrays.asList(1,2,3,4);
        System.out.println(listMultiplication(integerList));
        Optional<Integer> result = listMultiplicationOptional(integerList);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        List<Integer> integerListNew = new ArrayList<>();
        Optional<Integer> result2 = listMultiplicationOptional(integerListNew);
        if(result2.isPresent()){
            System.out.println(result.get());           // will get an exception if without checking isPresent we try to get the list as it is empty
        }*/

        Optional<Student> studentHighestGpa = highestGpaStudent(StudentDataBase.getAllStudents());
        if(studentHighestGpa.isPresent()){
            System.out.println("Highest GPA student is: "+studentHighestGpa.get());
        }
        // studentHighestGpa.ifPresent(student -> System.out.println("Highest GPA student is: " + student));
    }

}
