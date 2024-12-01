package section12;

import data.Student;
import data.StudentDataBase;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//List that contain all the activity of all the students
//here the activity element is not an element rather it is a list so to convert that list and to get a single list we need to use flatMap
//if we only get the activity from student then we will have an element ie list inside that element [[A, B], [C, D], [E, F]]
public class StudentActivityFlatMap {

    public static List<String> studentActivity(){

        List<String> studentActivity =  StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)                //this will return the activity list
                .peek(System.out::println)
//                .flatMap(Collection::stream)
//                .flatMap(activities -> activities.stream())
//                .flatMap((List<String> activities) -> activities.stream())


                .flatMap(List::stream)      // this will return each element of the activity list
                .peek(System.out::println)
                .collect(Collectors.toList());          // it will collect those elements and store it in a single list

        return studentActivity;
    }

    public static void main(String[] args) {
        System.out.println(studentActivity());
    }
}
